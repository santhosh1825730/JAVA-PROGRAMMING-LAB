date:13-10-26
exp no:14
                 CARD LAYOUT




Aim
To write a Java program using the CardLayout manager to display buttons one at a time. When a button is clicked, the next button is displayed.

Algorithm
Start the program.

Import the required packages: java.awt, java.applet, and java.awt.event.

Create a class named carddemo that extends Applet and implements ActionListener.

Declare four Button variables, a Panel, and a CardLayout object.

In the init() method:

Create a Panel.

Create a CardLayout object.

Set the CardLayout for the Panel.

Create three buttons.

Register ActionListener for each button.

Add the buttons to the Panel with unique names.

In the actionPerformed() method, use buttonCardLayout.next(buttonPanel) to display the next button.

Stop the program.


import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}
OUTPUT:
Initially displayed:
+----------------------+
|                      |
|     first Button     |
|                      |
+----------------------+
After clicking the first button:
+----------------------+
|                      |
|    second Button     |
|                      |
+----------------------+
After clicking the second button:
+----------------------+
|                      |
|     third button     |
|                      |
Result
Thus, the Java Applet program using the CardLayout manager was successfully written. It displays one button at a time and switches to the next button whenever the current button is clicked.

