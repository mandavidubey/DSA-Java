# Methods/Functions
A function is a block of code that performs a specific task. 
# Why are functions used? 
1. If some functionality is performed at multiple places in software, then  rather than writing the same code, again and again, we create a function  and call it everywhere. This helps reduce code redundancy.<br> 
2. Functions make maintenance of code easy as we have to change at one  place if we make future changes to the functionality. <br>
3. Functions make the code more readable and easy to understand. <br>

**The syntax for function declaration is** :<br>

return-type function_name (parameter 1, parameter2,  …… parameter n){  //function_body 
} 
return-type<br>

The **return type** of a function is the data type of the variable that that function  returns.<br>  

**For eg** - If we write a function that adds 2 integers and returns their sum then  the return type of this function will be ‘int’ as we will return a sum that is an  integer value. <br>
When a function does not return any value, in that case the return type of the  function is ‘void’. <br>

**function_name** <br>

It is the unique name of that function.  <br>
It is always recommended to declare a function before it is used. <br>

**Parameters**<br>

A function can take some parameters as inputs. These parameters are specified  along with their data types.<br>

**For eg**- if we are writing a function to add 2 integers, the parameters would be  passed like – 
int add (int num1, int num2)<br>

**main function**<br>

The main function is a special function as the computer starts running the code  from the beginning of the main function. Main function serves as the entry  point for the program.<br>

**Example** :<br>
```
package DSA;

public class Main {
   //A METHOD to calculate sum of 2 numbers - a & b
   public static void sum(int a, int b) {
       int sum = a + b;
       System.out.println(sum);
   }
  
   public static void main(String[] args) {
      int a = 10;
      int b = 20;
       sum(a, b); // Function Call

   }
}
```
