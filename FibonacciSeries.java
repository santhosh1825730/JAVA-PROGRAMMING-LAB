EXP NO:6
DATE:18-08-26
             FIBONACCI SEREIES
Aim
To write a Java program to print the Fibonacci series for a given number of terms.
Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read the number of terms n from the user.
4. Initialize a = 0 and b = 1.
5. Repeat the loop from i = 1 to n.
6. Print the value of a.
7. Calculate the next term using c = a + b.
8. Update a = b and b = c.
9. Repeat until all terms are printed.
10. Stop the program.
SOURCE CODE:    
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
OUTPUT:
Enter number of terms: 7
Fibonacci Series: 0 1 1 2 3 5 8
Result
Thus, the Java program to print the Fibonacci series for a given number of terms was executed successfully.
