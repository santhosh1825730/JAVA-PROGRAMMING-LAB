EXP NO:2(B)
DATE: 4-08-26
              EVEN OR ODD SWITCH CASE
AIM:To write a Java program to check whether a given number is even or odd using a switch statement.
Algorithm
1. Start the program.
2. Import the Scanner class.
3. Declare an integer variable n.
4. Read a number from the user.
5. Calculate the remainder using n % 2.
6. Use a switch statement:
   - Case 0: If the remainder is 0, print “This number is even.”
   - Case 1: If the remainder is 1, print “This number is odd.”
   - Default: Print “Invalid input.”
7. Stop the program.
SOURCE CODE:

    
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
OUTPUT:
Enter a number: 10
This number is even
Result
Thus, the Java program to check whether a number is even or odd using a switch statement was executed successfully.
