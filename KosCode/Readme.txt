This program requires lwjgl.jar and lwjgl_util.jar (www.lwjgl.org) to run,
and as such needs lwjgl's required natives to be linked either from the project
or by setting "org.lwjgl.librarypath" (abolute path pointing to the folder) at runtime.
"main.ChromeConflict" is what you want to start for running the game,
"dev.CCEclipse" is what I used to build the maps and then start the game.
Please note, that the included "res" folder needs to be present for the game to run.
You can move it, and specify where to find it by pointing "-res" at where you moved it to
(Example: "-res=E:\ChromeConflict\res"). Identical switches exist for "-data" (where the game
stores runtime information like config and screenshots) and "-base" (this one specifies where
to look for a "res" and "data" folder if they aren't defined in the command line).
In addition, if you are using an IDE like eclipse, you should add "-ide" because this
corrects an problem with the program figuring out where it is should you not specify
"-base" to point to any (possibly invalid) location, in addition to not redirecting
stdout and stderr to a file called "syslog.lo" in the base directory.

Also note, that I had to use an outdated version of the "engine" because I was
continuing to add things to it and change/improve what already existed, which
broke compatibility. I then had to use a backed up version of both, but I'm fairly
positive that this didn't result in a loss of any new code.
