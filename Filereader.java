EXP NO: 11(B)
DATE:29-09-26
                FILE READER 
  Aim
To write a Java program to read the contents of a file named sample2.txt using the FileReader class and display them on the console.
Algorithm
1. Start the program.
2. Import the java.io package.
3. Create a FileReader object to open the file sample2.txt.
4. Declare an integer variable i to store each character read from the file.
5. Read the file character by character using fr.read().
6. Repeat the loop until fr.read() returns -1, which indicates the end of the file.
7. Convert each integer value into a character and display it using System.out.println().
8. Close the file using fr.close().
9. If an exception occurs, display the exception message.
10. Stop the program.
SOURCE CODE:
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
OUTPUT:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
  Result
Thus, the Java program to read and display the contents of a file using the FileReader class was executed successfully.
