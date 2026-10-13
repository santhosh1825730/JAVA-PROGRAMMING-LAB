EXP NO: 3
DATE:11-08-26
                   STRING OPERATION
Aim
To write a Java program to demonstrate various String operations using built-in String methods.
Algorithm
1. Start the program.
2. Create a string variable str and initialize it with "Hello Java".
3. Find the length of the string using length().
4. Display the character at a specified index using charAt().
5. Convert the string to uppercase using toUpperCase().
6. Convert the string to lowercase using toLowerCase().
7. Extract a substring using substring().
8. Join two strings using concat().
9. Check whether the string contains a word using contains().
10. Find the index of a character using indexOf() and lastIndexOf().
11. Replace a word using replace().
12. Check the beginning and ending of the string using startsWith() and endsWith().
13. Compare two strings using equals().
14. Remove extra spaces at the beginning and end using trim().
15. Stop the program.
SOURCE CODE:
public class StringOperations {
    public static void main(String[] args) {

        String str = "Hello Java";
        System.out.println("1. Length: " + str.length());
        System.out.println("2. Character at index 1: " + str.charAt(1));
        System.out.println("3. Uppercase: " + str.toUpperCase());
        System.out.println("4. Lowercase: " + str.toLowerCase());
        System.out.println("5. Substring: " + str.substring(6));
        System.out.println("6. Concatenation: " + str.concat(" Programming"));
        System.out.println("7. Contains 'Java': " + str.contains("Java"));
        System.out.println("8. Index of 'J': " + str.indexOf('J'));
        System.out.println("9. Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("10. Replace: " + str.replace("Java", "World"));
        System.out.println("11. Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("12. Ends with 'Java': " + str.endsWith("Java"));
        String str2 = "Hello Java";
        System.out.println("13. Equals: " + str.equals(str2));
        String str3 = "   Hello Java   ";
        System.out.println("14. Trim: " + str3.trim());
    }
}
OUTPUT:
1. Length: 10
2. Character at index 1: e
3. Uppercase: HELLO JAVA
4. Lowercase: hello java
5. Substring: Java
6. Concatenation: Hello Java Programming
7. Contains 'Java': true
8. Index of 'J': 6
9. Last index of 'a': 9
10. Replace: Hello World
11. Starts with 'Hello': true
12. Ends with 'Java': true
13. Equals: true
14. Trim: Hello Java
Result
Thus, the Java program to demonstrate various String operations using built-in String methods was executed successfully.
