//Assignment5
//        Take a number as input from the user. Now write a program to show table of the given numbers. Output will be shown like this:-------------------------3
//        10*1=10
//        10*2=20
//        10*3=20
//        ..
//        10*10=100

package Conditional_Satatement;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i =1; i<=10; ++i){
            System.out.println(num+"*"+i+ "="+ num * i);
        }
//        System.out.println(num);
    }
}
