EXP NO:2(A)
DATE: 4-08-26
               ARITHEMATIC OPERATIONS USING SWITCH CASE
Aim
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a switch statement.
Algorithm
1. Start the program.
2. Import the Scanner class.
3. Create a Scanner object to read input from the user.
4. Use an infinite while loop to display the menu repeatedly.
5. Read two integer numbers, x and y.
6. Display the menu of arithmetic operations.
7. Read the user's choice.
8. Use a switch statement to perform the selected operation:
   - Case 1: Perform addition (x + y).
   - Case 2: Perform subtraction (x - y).
   - Case 3: Perform multiplication (x * y).
   - Case 4: Perform division (x / y), checking that y is not zero.
   - Case 5: Perform modulus (x % y).
   - Case 6: Exit the program.
9. If the choice is invalid, display “Invalid choice!”
10. Repeat the menu until the user chooses Exit.
11. Stop the program.
    SOURCE CODE:
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;

                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    int mod = x % y;
                    System.out.println("Result: " + mod);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
OUTPUT:
Enter the two numbers to perform operations
Enter the first number: 10
Enter the second number: 5

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
1
Result: 15
Result
Thus, the Java program to perform arithmetic operations using a switch statement was executed successfully.
