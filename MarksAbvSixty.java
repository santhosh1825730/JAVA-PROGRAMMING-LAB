EXP NO:1(D)
DATE: 28-07-26
                TO PRINT MARKS ABOVE 60 
Aim
To write a Java program to display the names and marks of students who scored more than 60 marks.
Algorithm
1. Start the program.
2. Import the Scanner class.
3. Declare two arrays: name[] to store student names and marks[] to store marks.
4. Read the names and marks of 6 students from the user.
5. Check each student's marks using a for loop.
6. If the marks are greater than 60, display the student's name and marks.
7. Stop the program.
SOURCE CODE:

import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}
import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}
OUTPUT:
Enter Name of Student and Marks of Subject 1: Ravi 75
Enter Name of Student and Marks of Subject 2: Sita 55
Enter Name of Student and Marks of Subject 3: Ram 80
Enter Name of Student and Marks of Subject 4: Priya 60
Enter Name of Student and Marks of Subject 5: Arun 90
Enter Name of Student and Marks of Subject 6: Geetha 45

Students scoring more than 60:
Ravi : 75
Ram : 80
Arun : 90
Result:
Thus, the Java program to display the names and marks of students scoring more than 60 was executed successfully.
