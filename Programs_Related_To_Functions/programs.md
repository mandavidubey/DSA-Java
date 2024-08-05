# Q1. Print Name

```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class printname {
    public static void printmyname(String name){
        System.out.println(name);
        return;//to get out of the function
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        String name = sc.next();

        printmyname(name);
    }
}

```

# Q2. Addition of 2 Numbers

```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Sum {
    public static void add(int a, int b){
        return a + b; //sum
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(add(a,b));
    }
}
```

# Q3. Multiplication of 2 Numbers
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Multiplication {
    public static void product(int a, int b){
        return a * b; //sum
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(product(a,b));
    }
}
```

# Q4. Factorial
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public static void Factorial(int n) {
       //loop
       if(n < 0) { //for negative number
           System.out.println("Invalid Number");
           return;
       }
       int factorial = 1;

       for(int i=n; i>=1; i--) {
           factorial = factorial * i;
       }

       System.out.println(factorial);
       return;
   }

```
# Q5. Prime or not
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class primeOrNot {
    public static void prime(int a) {
        if (a <= 1) {
            System.out.println(a + " is NOT a Prime Number");
            return;
        }
        boolean isPrime = true; // Assume the number is prime
        for (int i = 2; i <= Math.sqrt(a); i++) { // Check up to the square root of a
            if (a % i == 0) {
                isPrime = false;
                break; // No need to check further
            }
        }
        if (isPrime) {
            System.out.println(a + " is a Prime Number");
        } else {
            System.out.println(a + " is NOT a Prime Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        prime(a);
    }
}
```

# Q6. Even or not
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class checkEvenOrOdd {
    public static void checkEvenOrOdd(int a) {
        if (a < 0) {
            System.out.println("Invalid Number");
            return;
        }

        if (a % 2 == 0) {
            System.out.println(a + " is an Even Number");
        } else {
            System.out.println(a + " is an Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        checkEvenOrOdd(a);
    }
}
```

# Q7. Print a Multiplication Table
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class MultiplicationTable {
    public static void Table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "X" + i + "=" + a * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Table(a);
    }
}
```