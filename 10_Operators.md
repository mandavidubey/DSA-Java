# Operators in Java
Symbols that tell compiler to perform some operation.
# Types of Operators
1. Arithmetic Operators
    a. Unary Operators
        i. +
        ii. -
        iii. *
        iv. /
        v. % (Gives you remainder)
    b. Binary Operators
        i. ++ (Increment)
        ii. -- (Decrement)
2. Relational Operators (gives Boolean values)
    a. ==
    b. !=
    c. >
    d. <
    e. >=
    f. <=
3. Logical Operators
    a. && -> Logical AND
    b. || -> Logical OR
    c. ! -> Logical NOT
4. BITWISE Operators
    a. &
    b. |
    c. !
    d. ^
    e. ~
    f. <<
    g. >>
5. Assignment Operators
    a. =
    b. +=
    c. -+
    d. *=
    e. /=

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