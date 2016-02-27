package engine.util.ui;
 
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.IntBuffer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class UIUtils
{
    private UIUtils()
    {
        throw new Error();
    }
     
    /**
     * fixes a component so that a layout manager does not increase it over its preferred size
     * @param base component
     * @return the input value
     */
    public static <T extends Component> T fix(T base)
    {
        base.setMaximumSize(base.getPreferredSize());
        return base;
    }
     
    /**
     * adds components to a newly create JPanel<br>
     * allowed values for the components array:<br>
     * Components will be used directly<br>
     * a string will be represented by a JLabel<br>
     * a positive number will yield a strut along the axis and a negative one will be along the other axis<br>
     * zero will add a glue object in the correct axis (there is no inverted version)
     * @param xAxis if true the BoxLayout will align components along the X axis
     * @param components array of components to add, must be at least 2
     */
    public static JPanel add(boolean xAxis, Object... components)
    {
        if (components.length < 2) throw new IllegalArgumentException("count");
        else
        {
            Vector<Component> vec = new Vector<>(components.length);
            Component cmp = null, next;
            for (Object obj : components)
            {
                if (obj == null) throw new IllegalArgumentException("can not convert null to component");
                next = create(cmp, obj, xAxis);
                if (next == null) throw new IllegalArgumentException("can not convert \"" + obj + "\" to component");
                else if (next != cmp) vec.add(cmp = next);
            }
            if (vec.size() < 2) throw new IllegalArgumentException("count");
            else
            {
                JPanel temp = new JPanel();
                int axis = xAxis ? BoxLayout.X_AXIS : BoxLayout.Y_AXIS;
                temp.setLayout(new BoxLayout(temp, axis));
                for (int i = 0; i < vec.size(); i++)
                {
                    temp.add(vec.get(i));
                }
                return temp;
            }
        }
    }
     
    /**
     * create component, used by above method to allow easier arguments<br>
     * see {@link UserInterface#add(boolean, Object[])} for details on allowed values
     * @param prev internal use: previous component for tooltips
     * @param obj the object to turn into a component
     * @param xAxis if true the component will expect to be layed out on the X axis with the other components
     */
    private static Component create(Component prev, Object obj, boolean xAxis)
    {
        if (obj instanceof Number)
        {
            int i = ((Number) obj).intValue();
            if (i == 0)
            {
                if (xAxis) return Box.createHorizontalGlue();
                else return Box.createVerticalGlue();
            }
            else
            {
                if (i < 0)
                {
                    xAxis = !xAxis;
                    i = -i;
                }
                if (xAxis) return Box.createHorizontalStrut(i);
                else return Box.createVerticalStrut(i);
            }
        }
        else if (obj instanceof String)
        {
            String str = (String) obj;
            if (str.startsWith("(") && str.endsWith(")"))
            {
                str = str.substring(1, str.length() - 1);
                if (prev == null) throw new NullPointerException("can not add tooltip to null");
                else if (prev instanceof JComponent)
                {
                    ((JComponent) prev).setToolTipText(str);
                    return prev;
                }
                else throw new IllegalArgumentException(prev.getClass().getName() + " does not support tooltips");
            }
            else return new JLabel(str);
        }
        else if (obj instanceof Component)
        {
            return (Component) obj;
        }
        else return null;
    }
     
    /**
     * shows a new popup window which stays on top until any of the buttons are pressed or it is closed,
     * and a number is returned to indicate what happened
     * @param parent the popup window will block access to this window until done
     * @param contents what to display in the component, can be any Component, Image or String,
     * where a string may contain LF or CRLF as line separators
     * @param buttons all possible buttons which will be displayed at the bottom of the window
     * @return the index into the buttons array if a button was pressed or -1 if the window was closed
     */
    public static int showPopupWindow(Window parent, String title, Object contents, String... buttons)
    {
        // make sure not to do all the work for nothing
        if (parent == null || contents == null || buttons == null) throw new NullPointerException();
        if (contents instanceof String || contents instanceof Image || contents instanceof Component)
        {
            for (String curr : buttons)
            {
                if (curr == null) throw new NullPointerException();
            }
        }
        else throw new IllegalArgumentException("unknown content type");
         
        JPanel panel = null;
        if (contents instanceof String)
        {
            String str = (String) contents;
            Matcher m = Pattern.compile("(\r)?\n").matcher(str);
            int start = 0;
            while (m.find())
            {
                if (panel == null)
                {
                    panel = new JPanel();
                    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                    panel.add(Box.createVerticalStrut(8));
                }
                panel.add(add(true, 8, str.substring(start, m.start()), 8));
                start = m.end();
            }
             
            if (panel == null)
            {
                panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            }
            panel.add(add(true, 8, str.substring(start), 8));
            panel.add(Box.createVerticalStrut(8));
        }
        else if (contents instanceof Image)
        {
            panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(Box.createVerticalStrut(8));
            panel.add(new JLabel(new ImageIcon((Image) contents)));
            panel.add(Box.createVerticalStrut(8));
        }
        else if (contents instanceof Component)
        {
            panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(Box.createVerticalStrut(8));
            panel.add((Component) contents);
            panel.add(Box.createVerticalStrut(8));
        }
        else throw new Error("validation failed");
         
        IntBuffer buff = IntBuffer.allocate(1);
        JButton[] arr = new JButton[buttons.length];
        JPanel btnPnl = new JPanel();
        btnPnl.setLayout(new BoxLayout(btnPnl, BoxLayout.X_AXIS));
        for (int i = 0; i < arr.length; i++)
        {
            btnPnl.add(fix(arr[i] = new JButton(buttons[i])));
        }
        panel.add(btnPnl);
        panel.add(Box.createVerticalStrut(8));
         
        if (title == null) title = "";
        JDialog dialog = new JDialog(parent, title, Dialog.DEFAULT_MODALITY_TYPE);
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.setContentPane(panel);
        packAndCenter(dialog);
        dialog.setResizable(false);
        new Listener(buff, dialog, arr);
        dialog.setVisible(true);
        return buff.get(0);
    }
     
    private static final class Listener extends WindowAdapter implements ActionListener
    {
        private final IntBuffer lock;
        private final JDialog dialog;
        private final JButton[] buttons;
         
        private Listener(IntBuffer lock, JDialog dialog, JButton[] buttons)
        {
            this.lock = lock;
            this.dialog = dialog;
            this.buttons = buttons;
            dialog.addWindowListener(this);
            for (JButton button : buttons)
            {
                button.addActionListener(this);
            }
        }
         
        public void windowClosing(WindowEvent e)
        {
            if (lock.hasRemaining())
            {
                lock.put(-1);
                dialog.dispose();
            }
        }
         
        public void actionPerformed(ActionEvent e)
        {
            if (lock.hasRemaining())
            {
                Object src = e.getSource();
                for (int i = 0; i < buttons.length; i++)
                {
                    if (src == buttons[i])
                    {
                        lock.put(i);
                        dialog.dispose();
                        return;
                    }
                }
                System.err.println("received event " + e + " from unkown source");
            }
        }
    }
     
    /**
     * packs a window and centers is onscreen
     * @param window the target window
     */
    public static void packAndCenter(Window window)
    {
        window.pack();
        Dimension size = window.getSize();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation((screen.width - size.width) / 2, (screen.height - size.height) / 2);
    }
}