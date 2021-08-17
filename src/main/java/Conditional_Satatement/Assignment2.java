//Assignment2-
//        Write a program to calculate CGPA and find grade from 4 subjects (GPA will based upon your university)

package Conditional_Satatement;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cgpa = 0;
        double total_cgpa = 0;
        for (int i = 1; i <= 4; i++) {
            String nth = "";
            if (i == 1) {
                nth = "1st";
            }
            else if (i == 2){
                nth = "2nd";
            }
            else if (i == 3){
                nth = "3rd";
            }
            else {
                nth = "4th";
            }
            System.out.println("Enter mark of " + nth + " subject: ");

            int marks = scanner.nextInt();
            if (marks <= 100 && marks >= 80){
                cgpa = 4.00;
            } else if (marks <= 79 && marks >= 75){
                cgpa = 3.75;
            } else if (marks <= 74 && marks >= 70){
                cgpa = 3.50;
            } else if (marks <= 69 &&  marks >= 65) {
                cgpa = 3.25;
            } else if (marks <= 64 &&  marks >= 60) {
                cgpa = 3.00;
            } else if (marks <= 59 &&  marks >= 55) {
                cgpa = 2.75;
            } else if (marks <= 54 &&  marks >= 50) {
                cgpa = 2.50;
            } else if (marks <= 49 &&  marks >= 45) {
                cgpa = 2.25;
            } else if (marks <= 44 &&  marks >= 40){
                cgpa = 2.00;
            } else {
                cgpa = 0.00;
            }
            total_cgpa = total_cgpa + cgpa;
        }

//        "String.format" used for showing two point decimal
        System.out.println("Total GPA is " + String.format("%.2f",total_cgpa/4));
    }


}
