EXP NO:2(C)
DATE:4-08-26
                   LEAP YEAR
Aim
To write a Java program to check whether a given year is a leap year or not using if-else statements.
Algorithm
1. Start the program.
2. Import the Scanner class.
3. Create a Scanner object to read input.
4. Read the year from the user.
5. Check the following conditions:
   - If the year is divisible by 400, it is a leap year.
   - Otherwise, if the year is divisible by 100, it is not a leap year.
   - Otherwise, if the year is divisible by 4, it is a leap year.
   - Otherwise, it is not a leap year.
6. Display whether the given year is a leap year or not.
7. Close the Scanner.
8. Stop the program.
SOURCE CODE:
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        // Check leap year condition
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        // Output result
        if (flag) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

        s.close();
    }
}
OUTPUT:
Enter any year: 2024
Year 2024 is a leap year
Result
Thus, the Java program to check whether a given year is a leap year or not was executed successfully.
