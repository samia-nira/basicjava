package While_Do_Loop_Stirng;
//Assignment-2
//Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (i <= n) {
            if (isPrime(i))
                System.out.print(+i + " ");
            i++;
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        int i = 2;
        while (i < n) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }
}


