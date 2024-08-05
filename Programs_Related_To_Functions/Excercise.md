# 1. Enter 3 numbers from the user & make a function to print their average.

```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Average {
    public static void printAverage(int a, int b, int c){
        int avg = (a + b + c) / 3;
        System.out.println("Average is : " + avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printAverage(a, b, c);
    }
}
```

# 2. Write a function to print the sum of all odd numbers from 1 to n.

```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Sum {
    public static void sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfOdd(n);
    }
}
```

# 3. Write a function which takes in 2 numbers and returns the greater of those two.
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Maximum {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(max(a, b));
    }
}
```

# 4. Write a function that takes in the radius as input and returns the circumference of a circle.
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Circle {
    public static void circumference(int r) {
        double circum = 2*3.14*r;
        System.out.print("Circumference of circle is : " + circum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circumference(r);
    }
}
```

# 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Eligibility {
    public static void voting(int age) {
        if (age > 18) {
            System.out.print("Eligible to vote");
        } else {
            System.out.print("NOT Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        voting(age);
    }
}
```

# 6. Write an infinite loop using do while condition.
```
package Programs_Related_To_Functions;

public class Infinity {
    public static void main(String[] args) {
        do {

        } while (true);
    }
}
```

# 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class typesOfNumbers {
    public static void main(String args[]) {
        int positive = 0, negative = 0, zeros = 0;
        System.out.println("Press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input == 1) {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }

            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }

        System.out.println("Positives : " + positive);
        System.out.println("Negatives : " + negative);
        System.out.println("Zeros : " + zeros);
    }
}
```

# 8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Exponent {
    public static int answer(int x, int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= x;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(answer(x, n));
    }
}
```

# 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. 
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class GCD {
    //1st Method
    Method to compute GCD using Euclidean algorithm
    public static int calcGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        // Compute and print the GCD
        int gcd = calcGCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }
    //2nd Method
    public static void calcGCD(int n1, int n2) {
        while(n1 != n2) { 
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("GCD is : "+ n2);
        calcGCD(n1, n2);
        
    }   
 
}
```

# 10. Write a program to print Fibonacci series of n terms where n is input by user :
# 0 1 1 2 3 5 8 13 21 ..... 
# In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
```
package Programs_Related_To_Functions;

import java.util.Scanner;

public class Fibonacci {
    public static void series(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            // find nth term
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                // the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        series(n);
    }
}
```