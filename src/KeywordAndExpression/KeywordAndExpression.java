package KeywordAndExpression;

public class KeywordAndExpression {
    public static void main(String[] args) {

        // Expression: num1 = 10;
        int num1 = 10;

        // Expression: num2 = 5;
        int num2 = 5;


        int sum = num1 + num2; // Arithmetic Expression
        boolean isEqual = (num1 == num2); // Relational Expression
        boolean logicalResult = (num1 > num2) && (num2 < 10); // Logical Expression

        System.out.println("Sum: " + sum);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Logical Result: " + logicalResult);
    }
}