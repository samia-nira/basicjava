package While_Do_Loop_Stirng;
//Assignment-1
//        Write a program to sum of digits of a number by taking from user input
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int number, digit, sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        number = scanner.nextInt();
        while (number>0){
            digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
