# Loops
A loop is used for executing a block of statements repeatedly until a particular  condition is satisfied. A loop consists of an initialization statement, a test condition and an increment statement.<br>

**For Loop**<br>
The syntax of the for loop is  :<br>

```
for (initialization; condition; update) { 
 // body of-loop 
}
```

<br>

```
for (int i=1; i<=20; i++) {
   System.out.println(i);
}
```
<br>

**While Loop**<br>
The syntax for while loop is :<br>

```
while(condition) { 
 // body of the loop 
}
```
<br>

```
int i = 0;
while(i<=20) {
   System.out.println(i);
   i++;
}
```

<br>

**Do-While Loop**<br>
The syntax for the do-while loop is :<br>

```
do { 
 // body of loop; 
} 
while (condition);
```

<br>

```
int i = 0;
do {
   System.out.println(i);
   i++;
} while(i<=20);
```