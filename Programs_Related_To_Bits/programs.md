1. Write a program to find if a number is a power of 2 or not.

```
package Programs_Related_To_Bits;

import java.util.*;

public class Bits {
    public class PowerOfTwoChecker {
        // Method to check if a number is a power of 2
        public static boolean isPowerOfTwo(int n) {
            // Check if n is greater than 0 and if n & (n - 1) is 0
            return n > 0 && (n & (n - 1)) == 0;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (isPowerOfTwo(n)) {
                System.out.println(n + " is a power of 2.");
            } else {
                System.out.println(n + " is not a power of 2.");
            }
        }
    }
}
```

2. Write a program to toggle a bit a position = “pos” in a number “n”.
```
package Programs_Related_To_Bits;

import java.util.*;

public class Bits {
    public static int toggleBit(int n, int pos) {
        // Create a bitmask by shifting 1 to the left by pos positions
        int bitMask = 1 << pos;
        // Toggle the bit using XOR
        return n ^ bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        if (pos < 0) {
            System.out.println("Bit position must be non-negative.");
        } else {
            int result = toggleBit(n, pos);
            System.out.println("Number before toggling the bit: " + n);
            System.out.println("Number after toggling the bit at position " + pos + ": " + result);
        }
    }
}
```
3. Write a program to count the number of 1’s in a binary representation of the number.
```
package Programs_Related_To_Bits;

import java.util.*;

public class Bits {
    public static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            // Increment count if the least significant bit is 1
            count += (n & 1);
            // Shift right by 1 to process the next bit
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberOfOnes = countOnes(n);
        System.out.println("Number of 1s in the binary representation of " + n + " is: " + numberOfOnes);
    }
}
```

4. Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.
```
package Programs_Related_To_Bits;

import java.util.*;

public class Bits {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            // Prepend the remainder (0 or 1) to the binary string
            binary.insert(0, decimal % 2);
            // Divide the number by 2
            decimal /= 2;
        }
        return binary.toString();
    }

    // Function to convert a binary number (given as a string) to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // 2^0

        // Traverse the binary string from the end to start
        for (int i = binary.length() - 1; i >= 0; i--) {
            // Add the value of the bit (0 or 1) to the decimal result
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2; // Move to the next higher bit position
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the conversion type:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (choice == 1) {
            // Decimal to Binary
            System.out.print("Enter a decimal number: ");
            int decimalNumber = sc.nextInt();
            String binaryRepresentation = decimalToBinary(decimalNumber);
            System.out.println("Decimal " + decimalNumber + " to binary is: " + binaryRepresentation);
        } else if (choice == 2) {
            // Binary to Decimal
            System.out.print("Enter a binary number: ");
            String binaryNumber = sc.nextLine();
            // Validate the binary string input
            if (!binaryNumber.matches("[01]+")) {
                System.out.println("Invalid binary number. Please enter a binary number consisting of only 0s and 1s.");
            } else {
                int decimalRepresentation = binaryToDecimal(binaryNumber);
                System.out.println("Binary " + binaryNumber + " to decimal is: " + decimalRepresentation);
            }
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }
}
```
