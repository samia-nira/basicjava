package Basic;

import java.util.Scanner;

//    Assignment no. 04-
//    Write a program to generate random numbers from minimum range to maximum range by user input


public class Assignment4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Minimum range: ");
        int min = scanner.nextInt();
        System.out.println("Please Enter Maximum range: ");
        int max = scanner.nextInt();
        System.out.println((int) ((Math.random() * (max - min)) + min));
    }
}
