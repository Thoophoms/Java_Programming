## Java Ternary Operator

The Java Ternary Operator is a short way to perform if-else statement.

### Syntax

```java
result = condition ? value_if_true : value_if_false;
```

### How It Works

- **condition**: An expression that set to test if it is `true` or `false`, this always be a boolean test.
- **value_if_true**: The value assigned to `result` if the condition is `true`.
- **value_if_false**: The value assigned to `result` if the condition is `false`.

### Example

```java
int number = 10;
String result = (number > 5) ? "Greater than 5" : "Less than or equal to 5";
System.out.println(result); // Output: Greater than 5
```

In this example:
- `int number = 10`: this set that number equals to 10
- The condition `number > 5` test to see that `10 > 5` to `true` since `10` is greater than `5`.
- Since the condition is `true`, the `value_if_true` ("Greater than 5") is assigned to `result`.

If `number` was `4`, the output would be "Less than or equal to 5".

### Benefits

- **Concise**: The ternary operator allows you to write shorter and more readable code compared to traditional `if-else` statements.
- **Inline**: It's useful for making quick decisions within expressions, such as in variable assignments or return statements.


# Keep in Mind

When writing a boolean test

```java
boolean result = condition ? value_if_true : value_if_false;
```

The `value_if_true` has to be `true` and the `value_if_false` has to be `false`

# Do NOT SWITCH 

***DO NOT DO THIS***

```java
boolean result = condition ? false : true;
```

Because the result will switch as well, see the result switch in the code file