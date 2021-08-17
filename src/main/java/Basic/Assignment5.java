package Basic;

import java.util.Scanner;

//    Assignment no. 05-
//    Write a program to solve (a+b)^2 by taking input a and b from the user [^2 means whole square]


public class Assignment5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int a = scanner.nextInt();
        System.out.println("Please Enter another Number: ");
        int b = scanner.nextInt();
        double c = Math.pow((a + b), 2);
        System.out.println(c);

    }

}
