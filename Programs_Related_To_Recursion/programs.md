# 1. Print numbers from 5 to 1
```
package Programs_Related_To_Recursion;

public class Recursions {
    public static void printNumber(int n) {
        if (n == 0)//base case
            return;
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }
}
```
# 2. Print numbers from 1 to 5.
```
package Programs_Related_To_Recursion;

public class Recursions {
    public static void printNumber(int n) {
        if (n == 6)//base case
            return;
        System.out.println(n);
        printNumber(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }
}
```
# 3. Print the sum of first n natural numbers. 
```
package Programs_Related_To_Recursion;
import java.util.*;
public class Recursions {
    public static void printSum(int n, int sum) {
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n - 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n, 0);
    }
}
```
# 4. Print factorial of a number n.
```
package Programs_Related_To_Recursion;

import java.util.*;

public class Recursions {
    public static int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println(factorial);
    }
}
```
# 5. Print the fibonacci sequence till nth term.
```
package Programs_Related_To_Recursion;

import java.util.*;

public class Recursions {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
```
# 6. Print x^n (with stack height = n).
```
package Programs_Related_To_Recursion;

import java.util.*;

public class Recursions {
    public static int stack(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int x_ = stack(x, n - 1);
        int xn = x * x_;
        return xn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(stack(x, n));
    }
}
```
# 7. Print x^n (with stack height = logn).
```
package Programs_Related_To_Recursion;

import java.util.*;

public class Recursions {
    public static int stack(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return stack(x, n / 2) * stack(x, n / 2);
        } else {
            return x * stack(x, n / 2) * stack(x, n / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(stack(x, n));
    }
}
```