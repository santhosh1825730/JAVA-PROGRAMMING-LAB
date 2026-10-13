EXP NO: 1(C)
DATE:28-07-26
                 FIND THE SMALLEST IN THE ARRAY
Aim
To write a Java program to find the sum, largest, and smallest numbers in an array.
Algorithm
1. Start the program.
2. Import the Scanner class.
3. Initialize the array with the given elements.
4. Initialize sum = 0, min = a[0], and max = a[0].
5. Repeat the loop through all array elements.
6. If the current element is greater than max, update max.
7. If the current element is smaller than min, update min.
8. Add each element to sum.
9. Display the sum, largest number, and smallest number.
10. Stop the program.
SOURCE CODE:
import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}
OUTPUT:
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9
Result
Thus, the Java program to find the sum, largest, and smallest numbers in an array was executed successfully.



