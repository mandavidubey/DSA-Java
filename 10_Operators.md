# Operators in Java

Symbols that tell compiler to perform some operation.

# Types of Operators

**1. Arithmetic Operators**<br><br>
&nbsp; **a. Unary Operators**<br><br>
&nbsp;&nbsp; i. +<br><br>
&nbsp;&nbsp; ii. -<br><br>
&nbsp;&nbsp; iii. _<br><br>
&nbsp;&nbsp; iv. /<br><br>
&nbsp;&nbsp; v. % (Gives you remainder)<br><br>
&nbsp; **b. Binary Operators**<br><br>
&nbsp;&nbsp; i. ++ (Increment)<br><br>
&nbsp;&nbsp; ii. -- (Decrement)<br><br>
**2. Relational Operators (gives Boolean values)**<br><br>
&nbsp; a. ==<br><br>
&nbsp; b. !=<br><br>
&nbsp; c. ><br><br>
&nbsp; d. <<br><br>
&nbsp; e. >=<br><br>
&nbsp; f. <=<br><br>
**3. Logical Operators**<br><br>
&nbsp; a. && -> Logical AND<br><br>
&nbsp; b. || -> Logical OR<br><br>
&nbsp; c. ! -> Logical NOT<br><br>
**4. BITWISE Operators (Output is in Bits)**<br><br>
&nbsp; a. & -> Binary AND<br><br>
&nbsp; b. | -> Binary OR<br><br>
&nbsp; c. ^ -> Binary XOR<br><br>
&nbsp; d. ~ -> Binary One's Compliment<br><br>
&nbsp; e. << -> Binary Left Shift<br><br>
&nbsp; f. >> -> Binary Right Shift<br><br>
**5. Assignment Operators**<br><br>
&nbsp; a. =<br><br>
&nbsp; b. +=<br><br>
&nbsp; c. -+<br><br>
&nbsp; d. _=<br><br>
&nbsp; e. /=<br><br>

# Binary Operators

- Pre-increment (++a or --a)
Change value & then use it.<br>

```
int a = 10;
int b = 0;
b = a++;
System.out.println(a);//11
System.out.println(b);//10
```

<br>

```
int a = 10;
int b = 0;
b = a--;
System.out.println(a);//9
System.out.println(b);//9
```

- Post-increment (a++ or a--)
Use value & then change it.<br>

```
int a = 10;
int b = 0;
b = ++a;
System.out.println(a);//11
System.out.println(b);//11
```

<br>
```
int a = 10;
int b = 0;
b = --a;
System.out.println(a);//9
System.out.println(b);//10
```

# Decimal to Binary

1. Divide the given number by 2.
2. Read the remainders from down to up.
   Eg: Take number 4.<br>
   ![Division](image-1.png)

# Binary to Decimal

![Binary to Decimal](image-2.png)
