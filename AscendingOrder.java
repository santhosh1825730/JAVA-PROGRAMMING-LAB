exp no:1
date:28-07-26
                          SORT IN ASCENDING ORDER
AIM:To write a Java program to arrange the given array elements in ascending order (smallest to largest).
ALGORITHM:
1. Start the program.
2. Import the Scanner class.
3. Read the number of elements n from the user.
4. Create an array of size n.
5. Read all the array elements.
6. Compare each element with the remaining elements.
7. If a[i] > a[j], swap the elements using a temporary variable.
8. Display the array elements in ascending order.
9. Stop the program.

SOURCE CODE:
import java.util.Scanner;
public class 
AscendingOrder
{
public static void main(String[] args)
{
int n, temp;
Scanner s=new Scanner(System.in);
System.out.print("Enter number of elements you want in array:");n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if (a[i]>a[j])
{
temp=a[i];
a[j]=a[j];
a[j]=temp;
}
}
}
System.out.print("AscendingOrder:");
for (int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}
}
OUTPUT:
Enter number of elements you want in array: 5
Enter all the elements:
5
2
8
1
4
AscendingOrder:1,2,4,5,8
RESULT:
Thus, the Java program to arrange the array elements in ascending order was executed successfully.
