//Assignment3
//Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the
//        summation of 2 numbers. If user inputs the correct summation, print "Answer is correct" and
//        user will get 1 point. if user inputs wrong summation,  then user will get 0 point.
//        Finally after 5 iteration, total score will be shown.

package Conditional_Satatement;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int min1 = 0;
        int max1 = 50;
        int point = 0;

        for (int i = 1; i <= 5; i++) {
            int rand1 = (int) ((Math.random() * (max1 - min1)) + min1);
            int rand2 = (int) ((Math.random() * (max1 - min1)) + min1);

            System.out.println("Question "+i+ ": \nWhat is the sum of " + rand1 + " and " + rand2 + "?");
            Scanner scanner = new Scanner(System.in);

            int guess = scanner.nextInt();
            if (guess == rand1 + rand2) {
                System.out.println("Correct");
                point++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Quiz end! Your total score is "+ point+ " out of 5" );

    }
}
