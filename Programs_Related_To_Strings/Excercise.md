# 1.Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

```
package Programs_Related_To_Strings;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        boolean validInput = false;

        // Input validation for size
        while (!validInput) {
            System.out.print("Enter the number of strings: ");
            try {
                size = sc.nextInt();
                if (size <= 0) {
                    System.out.println("Size must be a positive integer.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // Clear the invalid input
            }
        }

        String[] array = new String[size];
        int totalLength = 0;

        // Read strings and calculate total length
        for (int i = 0; i < size; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            array[i] = sc.next();
            totalLength += array[i].length();
        }

        System.out.println("Total length of all strings: " + totalLength);
    }
}
```

# 2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.

# Example :

# original = “eabcdef’ ; result = “iabcdif”

# Original = “xyz” ; result = “xyz”

```
package Programs_Related_To_Strings;

import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
```
# 3. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
# Example : 
# email = “mandavidubey@gmail.com” ; username = “mandavidubey” 
# email = “helloWorld123@gmail.com”; username = “helloWorld123”
```
package Programs_Related_To_Strings;

import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String userName = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
```
