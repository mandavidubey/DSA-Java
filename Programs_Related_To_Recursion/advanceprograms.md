# 1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
```
package Programs_Related_To_Recursion;

import java.util.*;

public class recursion {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "B", "C");
    }
}
```
# 2. Print a string in reverse.
```
package Programs_Related_To_Recursion;

import java.util.*;

public class recursion {
    public static String revString(String str) {
        if (str.length() == 1) {
            return str;
        }
        char currChar = str.charAt(0);
        String nextString = revString(str.substring(1));
        return nextString + currChar;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = revString(str);
        System.out.println(reversed);
    }
}
```
# 3. Find the occurrence of the first and last occurrence of an element using recursion.
```
package Programs_Related_To_Recursion;

import java.util.*;

public class recursion {
    public static int first = -1;
    public static int last = -1;

    public static void getIndices(String str, char el, int idx) {
        if (idx == str.length()) {
            return;
        }
        if (str.charAt(idx) == el) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        getIndices(str, el, idx + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }
}
```
# 4. Check if an array is sorted (strictly increasing). - O(n)
```
package Programs_Related_To_Recursion;

import java.util.*;

public class recursion {
    public static boolean checkIfIncreasing(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }
        if (!checkIfIncreasing(arr, idx + 1)) {
            return false;
        }
        return arr[idx] < arr[idx + 1];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of Array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if (checkIfIncreasing(arr, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }
    }
}
```
# 5. Move all ‘x’ to the end of the string. - O(n)
```
package Programs_Related_To_Recursion;

import java.util.*;

public class recursion {
    // to add all 'x' to the end of the string
    public static String addX(int count) {
        String newStr = "x";
        for (int i = 1; i < count; i++) {
            newStr += 'x';
        }
        return newStr;
    }

    public static String moveAllX(String str, int idx, int count) {
        if (idx == str.length()) {
            return addX(count);
        }
        if (str.charAt(idx) == 'x') {

            return moveAllX(str, idx + 1, count + 1);
        } else {
            String nextStr = moveAllX(str, idx + 1, count);
            return str.charAt(idx) + nextStr;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        String newStr = moveAllX(str, 0, count);
        System.out.println(newStr);
    }
}
```
# 6. Remove duplicates in a string.
```
package Programs_Related_To_Recursion;

import java.util.*;

public class recursion {
    public static String removeDuplicates(String str, int idx, boolean[] present, StringBuilder result) {
        if (idx == str.length()) {
            return result.toString();
        }
        char curr = str.charAt(idx);
        // Convert character to lowercase to handle case insensitivity
        curr = Character.toLowerCase(curr);

        // Check if the character is within 'a' to 'z' range
        if (curr < 'a' || curr > 'z') {
            return removeDuplicates(str, idx + 1, present, result);
        }

        if (present[curr - 'a']) {
            return removeDuplicates(str, idx + 1, present, result);
        } else {
            present[curr - 'a'] = true;
            result.append(curr);
            return removeDuplicates(str, idx + 1, present, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] present = new boolean[26]; // Array to keep track of seen characters (for lowercase 'a'-'z')
        StringBuilder result = new StringBuilder();
        System.out.println(removeDuplicates(str, 0, present, result));
    }
}
```
# 7. Print all the subsequences of a string. Time complexity - O(2^n)
```
package Programs_Related_To_Recursion;

import java.util.*;

public class recursion {
    public static void printSubseq(String str, int idx, String res) {
        if (idx == str.length()) {
            System.out.println(res);
            return;
        }
        // choose
        printSubseq(str, idx + 1, res + str.charAt(idx));
        // don't choose
        printSubseq(str, idx + 1, res);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubseq(str, 0, "");
    }
}
```
# 8. Print all unique subsequences of a string.
```
package Programs_Related_To_Recursion;

import java.util.HashSet;
import java.util.*;

public class recursion {
    public static void printSubseq(String str, int idx, String res, HashSet<String> allSubseq) {
        if (idx == str.length()) {
            if (allSubseq.contains(res)) {
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        // choose
        printSubseq(str, idx + 1, res + str.charAt(idx), allSubseq);
        // don't choose
        printSubseq(str, idx + 1, res, allSubseq);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> allSubseq = new HashSet<>();
        printSubseq(str, 0, "", allSubseq);
    }
}
```
# 9. Print keypad combination
# ( 0 -> .;
# 1 -> abc
# 2 -> def
# 3 -> ghi
# 4 -> jkl
# 5 -> mno
# 6 -> pqrs
# 7 -> tu
# 8 -> vwx
# 9 -> yz
# )
```
package Programs_Related_To_Recursion;

import java.util.*;

public class recursion {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKeypadCombination(String number, int idx, String res) {
        if (idx == number.length()) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < keypad[number.charAt(idx) - '0'].length(); i++) {
            char curr = keypad[number.charAt(idx) - '0'].charAt(i);
            printKeypadCombination(number, idx + 1, res + curr);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        printKeypadCombination(number, 0, "");
    }
}
```