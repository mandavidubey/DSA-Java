# Operators in Java
Symbols that tell compiler to perform some operation.
# Types of Operators
1. Arithmetic Operators<br>
    a. Unary Operators<br>
        i. +<br>
        ii. -<br>
        iii. *<br>
        iv. /<br>
        v. % (Gives you remainder)<br>
    b. Binary Operators<br>
        i. ++ (Increment)<br>
        ii. -- (Decrement)<br>
2. Relational Operators (gives Boolean values)<br>
    a. ==<br>
    b. !=<br>
    c. ><br>
    d. <<br>
    e. >=<br>
    f. <=<br>
3. Logical Operators<br>
    a. && -> Logical AND<br>
    b. || -> Logical OR<br>
    c. ! -> Logical NOT<br>
4. BITWISE Operators (Output is in Bits)<br>
    a. & -> Binary AND<br>
    b. | -> Binary OR<br>
    c. ^ -> Binary XOR<br>
    d. ~ -> Binary One's Compliment<br>
    e. << -> Binary Left Shift<br>
    f. >> -> Binary Right Shift<br>
5. Assignment Operators<br>
    a. =<br>
    b. +=<br>
    c. -+<br>
    d. *=<br>
    e. /=<br>

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