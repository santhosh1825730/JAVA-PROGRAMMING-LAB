EXP N0:1(C)
DATE:28-07-26
                 FINDING  LARGEST OF THREE NUMBER
Aim
To write a Java program to find the largest of three numbers using if-else statements.
Algorithm
1. Start the program.
2. Import the Scanner class.
3. Declare three integer variables x, y, and z.
4. Read three numbers from the user.
5. Check whether x is greater than y and z.
6. If true, print “First number is largest.”
7. Otherwise, check whether y is greater than x and z.
8. If true, print “Second number is largest.”
9. Otherwise, check whether z is greater than x and y.
10. If true, print “Third number is largest.”
11. Otherwise, print “The numbers are not distinct or equal.”
12. Stop the program.
SOURCE CODE:
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}
OUTPUT:
Enter three integers:
10
25
15
Second number is largest
Result
Thus, the Java program to find the largest of three numbers using if-else statements was executed successfully.
