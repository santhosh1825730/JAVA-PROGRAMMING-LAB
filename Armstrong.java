EXP NO:05
DATE: 18-08-26
                ARMSTRONG NUMBER
 Aim
To write a Java program to check whether a given number is an Armstrong number or not.
Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read a positive number n from the user.
4. Store the original number in nu and initialize num = 0.
5. Repeat while nu != 0:
   - Find the last digit using rem = nu % 10.
   - Calculate the cube of the digit and add it to num.
   - Remove the last digit using nu = nu / 10.
6. Compare num with the original number n.
7. If both are equal, print “Armstrong Number.”
8. Otherwise, print “Not an Armstrong Number.”
9. Stop the program.
SOURCE CODE:
import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}
OUTPUT:
  Enter any Positive Number : 153
Armstrong Number
 Result
Thus, the Java program to check whether a given number is an Armstrong number or not was executed successfully.
