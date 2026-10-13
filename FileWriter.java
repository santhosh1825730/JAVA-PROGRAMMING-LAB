EXP NO:11(A)
DATE:29-09-26
                        FILE WRITER
Aim
To write a Java program to create a file named sample2.txt and write the uppercase English alphabets (A to Z) into the file using the FileWriter class.
Algorithm
1. Start the program.
2. Import the java.io package.
3. Create a FileWriter object to open or create the file sample2.txt.
4. Use a for loop with the character variable i starting from 65 and ending before 91.
5. Write each character into the file using fw.write(i).
6. Close the file using fw.close().
7. If an exception occurs, display the exception message.
8. Stop the program.
SOURCE CODE:
import java.io.*;

class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}
OUTPUT:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
Result
Thus, the Java program to write uppercase English alphabets from A to Z into a file using the FileWriter class was executed successfully
