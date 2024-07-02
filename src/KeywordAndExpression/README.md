# Keywords and Expressions in Java

## Keywords

Keywords are reserved words in Java that have a predefined meaning and cannot be used as identifiers (like variable names, class names, etc.). They are part of the syntax and each keyword has a specific function.

### List of Common Java Keywords
- `class` - Defines a class.
- `public` - An access modifier indicating that the member is accessible by any other class.
- `static` - Indicates that the member belongs to the class, rather than instances of the class.
- `void` - Specifies that a method does not return a value.
- `if` - Starts an if statement for conditional execution.
- `else` - Specifies a block of code to be executed if the if condition is false.
- `for` - Starts a for loop.
- `while` - Starts a while loop.
- `return` - Exits from the current method and optionally returns a value.
- `new` - Creates new objects.

Example:
```java
public class Example {
    public static void main(String[] args) {
        int number = 10;
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }
    }
}
```

## Expressions

Expressions in Java are constructs that evaluate to a single value. They can be a combination of variables, operators, and method calls.

### Types of Expressions
- **Arithmetic Expressions**: Perform mathematical operations.
  ```java
  int result = 5 + 3; // result is 8
  ```
- **Relational Expressions**: Compare values and return a boolean.
  ```java
  boolean isEqual = (5 == 3); // isEqual is false
  ```
- **Logical Expressions**: Combine boolean values and return a boolean.
  ```java
  boolean isTrue = (5 > 3) && (3 < 4); // isTrue is true
  ```

### Example of Expressions
```java
public class ExpressionExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2; // Arithmetic Expression
        boolean isEqual = (num1 == num2); // Relational Expression
        boolean logicalResult = (num1 > num2) && (num2 < 10); // Logical Expression

        System.out.println("Sum: " + sum);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Logical Result: " + logicalResult);
    }
}
```

## Summary

- **Keywords**: Reserved words with special meaning in Java.
- **Expressions**: Combinations of variables, operators, and method calls that evaluate to a value.
