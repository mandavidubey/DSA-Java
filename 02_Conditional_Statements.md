**1. Conditional Statements ‘if-else’**<br>
The if block is used to specify the code to be executed if the condition specified  in if is true, the else block is executed otherwise.<br>
```
int age = 30;
if(age > 18) {
   System.out.println("This is an adult");
} else {
   System.out.println("This is not an adult");
}
```
<br>

**2. Conditional Statements ‘switch’**<br>
Switch case statements are a substitute for long if statements that compare a variable to multiple values. After a match is found, it executes the corresponding code of that value case.<br>

The following example is to print days of the week:
```
int n = 1;
switch(n) {
   case 1 :
       System.out.println("Monday");
       break;
   case 2 :
       System.out.println("Tuesday");
       break;
   case 3 :
       System.out.println("Wednesday");
       break;
   case 4 :
       System.out.println("Thursday");
       break;
   case 5:
       System.out.println("Friday");
       break;
   case 6 :
       System.out.println("Saturday");
       break;
   default :
       System.out.println("Sunday");
}
```