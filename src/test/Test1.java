/***
 * Challenge 1
 * todo 1 : Create a double variable with the value of 20.00
 * todo 2 : Create a second double variable with the value of 80.00
 * todo 3 : Add both numbers together, then multiply by 100.00
 * todo 4 : Use the remainder operator to figure out what the remainder od the operation in step three and 40.00 will be
 * todo 5 : Create a boolean variable that assigns the value true when the remainder in step 4 is equal to 0.00, and false if the result is not equal to 0.00
 * todo 6 : Output the boolean variable just to see what the result is (true or false)
 * todo 7 : Write an if-then statement that displays a message, 'got some remainder' if the boolean in step 5 is false
 */

package test;

public class Test1 {
    public static void main(String[] args) {
        // todo 1 : Create a double variable with the value of 20.00
        double value1 = 20.00d;

        // todo 2 : Create a second double variable with the value of 80.00
        double value2 = 80.00d;

        // todo 3 : Add both numbers together, then multiply by 100.00
        double value3 = (value1 + value2) * 100.00d;
        System.out.println("The value of ((value1 + value2) * 100) is: " + value3);

        // todo 4 : Use the remainder operator to figure out what the remainder of
        //  the operation in step three and 40.00 will be
        double remainder = value3 % 40.00d;
        System.out.println("The remainder is: " + remainder);

        // todo 5 : Create a boolean variable that assigns the value true
        //  when the remainder in step 4 is equal to 0.00,
        //  and false if the result is not equal to 0.00
        boolean isNoRemainder = (remainder == 0.00) ? true : false; {

            // todo 6 : Output the boolean variable just to see what the result is
            //  (true or false)
            System.out.println("isNoRemainis: " + isNoRemainder);
        }

        String finalResult = (isNoRemainder) ? "So, there is no remainder": "Got some remainder"; {
            System.out.println(finalResult);
        }


        // todo 7 : Write an if-then statement that displays a message, 'got some remainder'
        //  if the boolean in step 5 is false
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}