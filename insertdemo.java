date:13-10-26
exp no:16 
                BorderLayout using Java Applet
  Aim:

To write a Java program to demonstrate the BorderLayout manager in an Applet by placing buttons in five different positions (North, South, East, West, Center).

Algorithm:
1. Start the program.
2. Import the required packages: AWT, Applet, IO and Util.
3. Create a class named insertdemo that extends Applet.
4. Define the init() method.
5. Set the background color to cyan.
6. Set the layout to BorderLayout.
7. Add buttons in five positions:
   - North – Top button.
   - South – Bottom button.
   - East – Right button.
   - West – Left button.
   - Center – TextArea.
8. Define the getInsets() method to set a 10-pixel margin on all sides.
9. Stop the program.
  source code:
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*
<applet code="insertdemo" width=400 height=200>
</applet>
*/
public class insertdemo extends Applet
{
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("this is cross the top"),BorderLayout.NORTH);
add(new Button("the footer messsage might go here"),BorderLayout.SOUTH);
add(new Button("RIGHT"),BorderLayout.EAST);
add(new Button("LEFT"),BorderLayout.WEST);
String msg="the reasonable man adapts\n\n";
add(new TextArea(msg),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(10,10,10,10);
}
}
