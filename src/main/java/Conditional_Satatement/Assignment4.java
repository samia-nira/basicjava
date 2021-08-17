//Assignment 4
//        Write a program to check balance and withdraw money from ATM booth using switch case and if else (1. Check balance 2. Withdraw Money)
//        Notes:
//        1. If user inputs wrong PIN more than 3 times, following error should be shown: "You have entered wrong PIN more than 3 times. Card has blocked." and takes the valid PIN again
//        2. If user inputs an amount that is not divisible by 500, then system should throw an error message as "Balance is not divisible by 500. Please try with another amount" and takes the valid input again
//        3. If user inputs more than balance, then system should throw an error message as "Not enough balance. Please input valid amount" and takes the valid input again

package Conditional_Satatement;

import java.util.Scanner;

public class Assignment4 {
    private static boolean checkLogin() {
        boolean blocked = false;
        for (int i = 1; i <= 3; i++) {
            boolean flag = false;
            System.out.println("Please Enter your pin: ");
            String pin = "1234";
            Scanner scanner = new Scanner(System.in);
            String user_pin = scanner.nextLine();
            if (pin.equals(user_pin)) {
                flag = true;
            } else {
                System.out.println("Wrong pin inserted");
            }
            if (flag == true) {
                return true;
            }
            if (i == 3 && flag == false) {
                blocked = true;
            }
        }
        if (blocked) {
            System.out.println("You have entered wrong pin 3 times Card has been blocked. ");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw balance");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        double balance = 6000;
        if (result == 1 || result == 2) {
            if (result == 1) {
                if (checkLogin()) {
                    System.out.println("Your balance is " + balance + "Tk.");
                }
            } else if (result == 2) {
                boolean done = false;
                while (!done) {
                    if (!checkLogin()) {
                        done = true;
                    } else {
                        System.out.println("Input amount multiply by 500.");
                        int amount = scanner.nextInt();
                        System.out.println(amount);
                        if (amount % 500 != 0) {
                            System.out.println("Balance is not multiply by 500. Please try with another amount.");
                        } else if (amount > balance) {
                            System.out.println("Not enough balance, please input valid amount.");
                        } else {
                            balance -= amount;
                            System.out.println("Withdraw successful. Your current balance is " + balance + ".");
                            done = true;
                        }
                    }
                }
            }
        } else {
            System.out.println("Invalid choice.");
        }


    }
}
