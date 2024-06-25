### Java Or Operator (`||`)

The Or operator (`||`) in Java is used as a logical operator for Boolean expressions. It will return `true` if the condition is `true`, and `false` otherwise.

**Syntax:**
```java
boolean result = condition1 || condition2;
```

**Explanation:**
- `condition1` and `condition2` are Boolean expressions or conditions.
- The Or operator (`||`) will look at `condition1` first. If `condition1` is `true`, then `condition2` will not be looked at because the entire expression (`condition1 || condition2`) is already determined to be `true`.
- If `condition1` is `false`, then `condition2` will be look at. The result of the Or operator is `true` if either `condition1` or `condition2` (or both) are `true`, otherwise, it is `false`.

**Example:**
```java
int age = 21;
boolean canRideRollerCoster = (age >= 15) || (age <= 60); // Checks if age is either 15 or older, or 60 or younger
// canRideRollerCoster will be true because age >= 15 is true, so the entire expression is true
```

In the example above:
- `canRideRollerCoster` will be `true` because the age (`21`) satisfies the condition `age >= 15`, making the entire expression `(age >= 15) || (age <= 60)` true.

The Or operator (`||`) is commonly used in conditional statements (`if`, `while`, `for` loops) and expressions to control the flow of execution based on multiple conditions.

---