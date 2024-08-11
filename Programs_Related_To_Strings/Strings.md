# 1. Comparing 2 Strings
```
package Programs_Related_To_Strings;

public class Comparing_2_Strings {
    public static void main(String args[]) {
        String name1 = "Mandavi";
        String name2 = "Mandavi";

        if (name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // DO NOT USE == to check for string equality
        // Gives correct answer here
        if (name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // Gives incorrect answer here
        if (new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

    }
}
```

# 2. Substring
The substring of a string is a subpart of it.<br>
```
package Programs_Related_To_Strings;

public class Substrings {
    public static void main(String[] args) {
        String name = "MandaviDubey";
        System.out.println(name.substring(0, 7));
    }
}
```

# 3. ParseInt Method of Integer class
```
package Programs_Related_To_Strings;

public class Strings {
    public static void main(String args[]) {
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
```

# 4. ToString Method of String class
```
package Programs_Related_To_Strings;

public class Strings {
    public static void main(String args[]) {
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());
    }
}
```
