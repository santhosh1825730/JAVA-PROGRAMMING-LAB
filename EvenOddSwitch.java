EXP NO:1(B)
DATE:28-07-26
                     BINARY SEARCH
  Aim:
To write a Java program to search for an element in an array using the Binary Search method.
Algorithm:
1. Start the program.
2. Import the Scanner class.
3. Read the number of elements n.
4. Create an array and read the elements in ascending order.
5. Read the element x to be searched.
6. Initialize first = 0 and last = n - 1.
7. Calculate the middle position using mid = (first + last) / 2.
8. Compare the middle element with the search element:
   - If a[mid] == x, print “Element found.”
   - If a[mid] > x, set last = mid - 1.
   - If a[mid] < x, set first = mid + 1.
9. Repeat until the element is found or first > last.
10. If the element is not found, print “Element not found.”
11. Stop the program.


  SOURCE CODE:

  import java.util.Scanner;
class BinarySearch
{
  public static void main(String ar[])
{
  int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of elemnts: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array: ");
for(i=0;i<n;++i)
a[i]=sc.nextInt();
System.out.println("Enter element to search: ");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
  mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
  flag=1;
System.out.println("element found");
break;
}
}
if(flag==0)
System.out.println("element not found");
}
}


import java.util.Scanner;
class BinarySearch
{
  public static void main(String ar[])
{
  int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of elemnts: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array: ");
for(i=0;i<n;++i)
a[i]=sc.nextInt();
System.out.println("Enter element to search: ");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
  mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
  flag=1;
System.out.println("element found");
break;
}
}
if(flag==0)
System.out.println("element not found");
}
}


import java.util.Scanner;
class BinarySearch
{
  public static void main(String ar[])
{
  int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of elemnts: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array: ");
for(i=0;i<n;++i)
a[i]=sc.nextInt();
System.out.println("Enter element to search: ");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
  mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
  flag=1;
System.out.println("element found");
break;
}
}
if(flag==0)
System.out.println("element not found");
}
}
OUTPUT:
Enter no of elemnts:
5
Enter elements of array:
10
20
30
40
50
Enter element to search:
25
element not found

RESULT:
Thus, the Java program to search for an element in an array using the Binary Search method was executed successfully.
