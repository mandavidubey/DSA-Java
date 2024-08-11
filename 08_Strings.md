# Declaration
```
String name = "Mandavi";
```

# Taking Input
```
Scanner sc = new Scanner(System.in);
String name = sc.next();
```
=> whenever you want to take a word as input then use `sc.next()` otherwise for more than one word write `sc.nextLine()`

# Concatenation ( Joining 2 Strings )
```
String firstName = "Mandavi";
String lastName = "Dubey";
String fullName = firstName + " " + lastName;
System.out.print(fullName);
```

# Length of a String
```
String firstName = "Mandavi";
String lastName = "Dubey";
String fullName = firstName + " " + lastName;
System.out.print(fullName.length());
```

# Access characters of a String
```
String firstName = "Mandavi";
String lastName = "Dubey";
String fullName = firstName + " " + lastName;
System.out.print(fullName.length());
for(int i=0; i<fullName.length(); i++) {
    System.out.println(fullName.charAt(i));
}
```

**NOTE: JAVA STRINGS ARE IMMUTABLE**