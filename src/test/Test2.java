/**
 * Todo 1: Set the score variable to 10,000
 * Todo 2: Set the levelCompleted variable to 8
 * Todo 3: Set the bonus variable to 200
 * Todo 4: Create if condition if gameOver is true, then you want to perform the same calculation, and print out the value of the finalScore variable;
 */

package test;

public class Test2 {
    public static void main(String[] args) {
        // Todo 1: Set the score variable to 10,000
        int score = 10000;

        // Todo 2: Set the levelCompleted variable to 8
        int levelCompleted = 8;

        // Todo 3: Set the bonus variable to 200
        int bonus = 200;

        //  Todo 4: Create if condition if gameOver is true,
        //   then you want to perform the same calculation,
        //   and print out the value of the finalScore variable;
        boolean gameOver = true;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }
    }
}
