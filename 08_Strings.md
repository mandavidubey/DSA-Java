# Declaration
```
String name = "Mandavi";
```
<br>

# Taking Input
```
Scanner sc = new Scanner(System.in);
String name = sc.next();
```
=> whenever you want to take a word as input then use `sc.next()` otherwise for more than one word write `sc.nextLine()`
<br>

# Concatenation ( Joining 2 Strings )
```
String firstName = "Mandavi";
String lastName = "Dubey";
String fullName = firstName + " " + lastName;
System.out.print(fullName);
```
<br>

# Length of a String
```
String firstName = "Mandavi";
String lastName = "Dubey";
String fullName = firstName + " " + lastName;
System.out.print(fullName.length());
```
<br>

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
<br>

**NOTE: JAVA STRINGS ARE IMMUTABLE**