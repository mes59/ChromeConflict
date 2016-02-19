package engine.app.graphics;

import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

import engine.math.vec.Vec;

public class GLUtils
{
	private static final FloatBuffer buff = BufferUtils.createFloatBuffer(16);
	private static final Matrix4f matrix = new Matrix4f();
	private static final Vector4f vector = new Vector4f();
	
	private static volatile int mode;
	
	static void destroy()
	{
		synchronized (GLUtils.class)
		{
			mode = 0;
		}
	}
	
	public static final class Ortho
	{
		private static float left, right;
		private static float bottom, top;
		private static float near, far;
		
		static void create(float left, float right, float bottom, float top, float near, float far)
		{
			synchronized (GLUtils.class)
			{
				if (left == right || bottom == top || near == far) return;
				
				mode = 1;
				Ortho.left = left;
				Ortho.right = right;
				Ortho.bottom = bottom;
				Ortho.top = top;
				Ortho.near = near;
				Ortho.far = far;
				GL11.glOrtho(left, right, bottom, top, near, far);
			}
		}
		
		public static float getWidth()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				if (right > left) return right - left;
				return left - right;
			}
		}
		
		public static float getHeight()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				if (top > bottom) return top - bottom;
				return bottom - top;
			}
		}
		
		public static float getDepth()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				if (far > near) return far - near;
				return near - far;
			}
		}
		
		public static float getLeft()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				return left;
			}
		}
		
		public static float getRight()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				return right;
			}
		}
		
		public static float getBottom()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				return bottom;
			}
		}
		
		public static float getTop()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				return top;
			}
		}
		
		public static float getNear()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				return near;
			}
		}
		
		public static float getFar()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 1) throw new IllegalStateException("not initialized");
				return far;
			}
		}
	}
	
	public static final class Perspective
	{
		private static float fovy, aspect;
		private static float near, far;
		
		static void create(float fovy, float aspect, float near, float far)
		{
			synchronized (GLUtils.class)
			{
				if (far - near == 0 || Math.sin(fovy * (float) Math.PI / 360) == 0 || aspect == 0) return;
				
				mode = 2;
				Perspective.fovy = fovy;
				Perspective.aspect = aspect;
				Perspective.near = near;
				Perspective.far = far;
				GLU.gluPerspective(fovy, aspect, near, far);
			}
		}
		
		public static float getFOVY()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 2) throw new IllegalStateException("not initialized");
				return fovy;
			}
		}
		
		public static float getFOVX()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 2) throw new IllegalStateException("not initialized");
				return fovy * aspect;
			}
		}
		
		public static float getAspect()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 2) throw new IllegalStateException("not initialized");
				return aspect;
			}
		}
		
		public static float getNear()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 2) throw new IllegalStateException("not initialized");
				return near;
			}
		}
		
		public static float getFar()
		{
			synchronized (GLUtils.class)
			{
				if (mode != 2) throw new IllegalStateException("not initialized");
				return far;
			}
		}
	}
	
	public static Vec render(Vec src, Vec dst, boolean reverse)
	{
		synchronized (buff)
		{
			if (dst == null) dst = src.copy();
			GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, buff);
			matrix.load(buff);
			buff.rewind();
			return render(matrix, src, dst, reverse);
		}
	}
	
	public static Vec render(Matrix4f matrix, Vec src, Vec dst, boolean reverse)
	{
		if (dst == null) dst = src.copy();
		if (reverse && matrix.invert() != matrix)
		{
			throw new RuntimeException("matrix calculation failed");
		}
		
		vector.x = (float) src.x();
		vector.y = (float) src.y();
		vector.z = (float) src.z();
		if (src.getDimensions() < 4) vector.w = 1;
		else vector.w = (float) src.w();
		Matrix4f.transform(matrix, vector, vector);
		dst.set(vector.x, vector.y, vector.z, vector.w);
		return dst;
	}
}
