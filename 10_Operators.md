# Operators in Java

Symbols that tell compiler to perform some operation.

# Types of Operators

**1. Arithmetic Operators**<br>
&nbsp; **a. Unary Operators**<br>
&nbsp;&nbsp; i. +<br>
&nbsp;&nbsp; ii. -<br>
&nbsp;&nbsp; iii. _<br>
&nbsp;&nbsp; iv. /<br>
&nbsp;&nbsp; v. % (Gives you remainder)<br>
&nbsp; **b. Binary Operators**<br>
&nbsp;&nbsp; i. ++ (Increment)<br>
&nbsp;&nbsp; ii. -- (Decrement)<br>
**2. Relational Operators (gives Boolean values)**<br>
&nbsp; a. ==<br>
&nbsp; b. !=<br>
&nbsp; c. ><br>
&nbsp; d. <<br>
&nbsp; e. >=<br>
&nbsp; f. <=<br>
**3. Logical Operators**<br>
&nbsp; a. && -> Logical AND<br>
&nbsp; b. || -> Logical OR<br>
&nbsp; c. ! -> Logical NOT<br>
**4. BITWISE Operators (Output is in Bits)**<br>
&nbsp; a. & -> Binary AND<br>
&nbsp; b. | -> Binary OR<br>
&nbsp; c. ^ -> Binary XOR<br>
&nbsp; d. ~ -> Binary One's Compliment<br>
&nbsp; e. << -> Binary Left Shift<br>
&nbsp; f. >> -> Binary Right Shift<br>
**5. Assignment Operators**<br>
&nbsp; a. =<br>
&nbsp; b. +=<br>
&nbsp; c. -+<br>
&nbsp; d. _=<br>
&nbsp; e. /=<br>

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
