package Basic;

import java.util.Scanner;

//Assignment no. 03- Write a program to take 3 inputs from user and do sum and average

public class Assignment3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Number: ");
        double input_1 = scanner.nextDouble();
        System.out.println("Please Enter Second Number: ");
        double input_2 = scanner.nextDouble();
        System.out.println("Please Enter Third Number: ");
        double input_3 = scanner.nextDouble();
        System.out.println("Sum is " +(input_1+input_2+input_3));
        System.out.println("Average is " +(input_1+input_2+input_3)/3);
    }

}
