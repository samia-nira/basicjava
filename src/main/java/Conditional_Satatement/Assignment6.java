//Assignment6
//        Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input]

package Conditional_Satatement;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        String PrimeNumbers ="";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (i = 2; i<=n; i++){
            int count = 0;
            for (num = i; num>=1; num--){
                if (i%num==0){
                    count = count + 1;
                }
            }
            if (count==2){
                PrimeNumbers = PrimeNumbers+ i + " ";

            }
        }
        System.out.println("Prime numbers from 2 to n are : ");
        System.out.println(PrimeNumbers);
    }
}