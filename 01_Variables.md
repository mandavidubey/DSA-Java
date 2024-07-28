# Functions
A function is a block of code which takes some input, performs some operations and returns some output.<br> 
The functions stored inside classes are called methods.<br>
*The function we have used is called main.*<br>

# Class
A class is a group of objects which have common properties. A class can have some properties and functions (called methods).<br>
*The class we have used is Main.*

# Basic Program
```
public class Main {

   public static void main(String[] args) {
  // Our 1st Program
       System.out.println("Hello World");
   }
}
```
<br>

# Variables & Data Types

**1. Variables**<br>
A variable is a container (storage area) used to hold data.  
Each variable should be given a unique name (identifier).  
```
package dsa;

public class Main {

   public static void main(String[] args) {
      // Variables
       String name = "Mandavi";
       int age = 22;

       String neighbour = "Ram";
       String friend = neighbour;
   }
}
```
**2. Data Types**<br>
Data types are declarations for variables. This determines the type and size of  data associated with variables which is essential to know since different data  types occupy different sizes of memory.

There are 2 types of Data Types :
- Primitive Data types : to store simple values
- Non-Primitive Data types : to store complex values

**Primitive Data Types**<br>
These are the data types of fixed size.

|**Data Type**|**Meaning**|**Size(in Bytes)**|**Range**|
|-------------|-----------|------------------|---------|
|byte|2’s complement integer|1|-128 to 127|
|short|2’s complement integer|2|-32K to 32K|
|int|Integer numbers|4|-2B to 2B|
|long|2’s complement integer(larger values)|8|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|float|Floating-point|4|Upto 7 decimal digits|
|double|Double Floating-point|8|Upto 16 decimal digits|
|char|Character|2|a, b, c ..A, B, C ..@, #, $ ..|
|bool|Boolean|1|True, false|
<br>

**Non-Primitive Data Types**
These are of variable size & are usually declared with a ‘new’ keyword.<br>

Eg : String, Arrays<br>
```
String name = new String("Aman");
int[] marks = new int[3];
marks[0] = 97;
marks[1] = 98;
marks[2] = 95;
```

**3. Constants**<br>
A constant is a variable in Java which has a fixed value i.e. it cannot be assigned a different value once assigned.
```
package dsa;

public class Main {

   public static void main(String[] args) {
  // Constants
       final float PI = 3.14F;
   }
}
```