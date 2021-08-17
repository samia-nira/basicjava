//        Assignment1-
//        Write a program that takes a year from user and print whether that year is a leap year or not

package Conditional_Satatement;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int number = scanner.nextInt();
        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    System.out.println("This is Leap Year");
                }
                else {
                    System.out.println("This is not Leap Year");
                }
            }
            else {
                System.out.println("This is  Leap Year");
            }
        } else {
            System.out.println("This is not Leap Year");
        }
    }
    }

