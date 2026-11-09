exp no:13
date:13-10-26
               Title: Drawing a Smiley Face using Java Applet
   Aim:

To write a Java program to draw a human face using different Graphics methods in an Applet.

Algorithm:
1. Start the program.
2. Import the required packages such as AWT, IO and Applet.
3. Create a class named face that extends the Applet class.
4. Define the paint(Graphics g) method.
5. Use drawOval() to draw the face.
6. Use drawOval() to draw the two eyes.
7. Use drawOval() and fillOval() to draw the eyeballs.
8. Use fillArc() to draw the nose and mouth.
9. Use drawOval() to draw the two ears.
10. Stop the program.
source code:
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
Result:

Thus, the Java Applet program to draw a human face using Graphics methods was successfully executed.
