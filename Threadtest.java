exp no:10(A)
date:15-09-26
                        SIMPLE THREAD
Aim
To write a Java program to create multiple threads using the Thread class and demonstrate the use of yield() and sleep() methods.

Algorithm
Start the program.

Create three thread classes, A, B, and C, by extending the Thread class.

In thread A, print numbers from 1 to 5 and use Thread.yield() when i == 1.

In thread B, print numbers from 1 to 5 and terminate the loop when j == 3 using break.

In thread C, print numbers from 1 to 5 and pause the thread for 1500 milliseconds when k == 1 using Thread.sleep().

In the main() method, create objects of all three thread classes.

Start the threads using the start() method.

Print the main thread's exit message.

Stop the program.
SOURCE CODE:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}
OUTPUT:
Start thread A
exit from main thread
from thread B j=1
from thread B j=2
from thread B j=3
exit from B
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
thread C = 1
thread C = 2
thread C = 3
thread C = 4
thread C = 5
Result
Thus, the Java program was executed successfully to demonstrate multithreading using the yield() and sleep() methods.

