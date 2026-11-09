date:13-10-26
  exp no:14
             Title: GridLayout using Java Applet
  Aim:

To write a Java program to demonstrate the GridLayout manager in an Applet by arranging 10 buttons in 5 rows and 2 columns.

Algorithm:
1. Start the program.
2. Import the required packages such as AWT, IO and Applet.
3. Create a class named gld that extends the Applet class.
4. Define the init() method.
5. Set the layout using GridLayout(5,2).
6. Create 10 buttons with names A, B, C, D, E, F, G, H, I and J.
7. Add all 10 buttons to the Applet.
8. Define the getInsets() method to provide a 20-pixel margin on all sides.
9. Stop the program.
  source code:
import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/

public class gld extends Applet
{
public void init()
{
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}
Result:

Thus, the Java Applet program to demonstrate the GridLayout manager was successfully executed, and 10 buttons were arranged in 5 rows and 2 columns.
