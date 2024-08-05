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