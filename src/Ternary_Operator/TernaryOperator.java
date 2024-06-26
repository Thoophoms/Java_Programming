package Ternary_Operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 10;

        String result = (number > 5) ? "True! Greater than 5": "False! Less than or equal to 5";
        System.out.println(result);

        // A boolean test

        String makeOfCar = "Jeep";
        boolean isDomestic = (makeOfCar == "Mini Cooper")? true : false;
        System.out.println(isDomestic);

        String Domestic = (isDomestic) ? "This car is domestic to our counter" : "This car is not domestic to our counter";
        System.out.println(Domestic);

        // DO NOT SWITCH LIKE THIS
        boolean dontDoThis = (makeOfCar == "Mini Cooper")? false : true;
        System.out.println(dontDoThis);
        // this will get the result as true which is incorrect

        String wrongResult = (dontDoThis) ? "This car is domestic to our counter" : "This car is not domestic to our counter";
        System.out.println(wrongResult);
        // this will get the result as "This car is domestic to our counter" which is incorrect

    }
}