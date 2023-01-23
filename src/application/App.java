package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char yesOrNo = sc.next().charAt(0);

        if (yesOrNo == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new Account(number, name, initialDeposit);
        } else {
            acc = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(acc);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double newDeposit = sc.nextDouble();
        acc.deposit(newDeposit);
        System.out.println("Updated account data: ");
        System.out.println(acc);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double newWithdraw = sc.nextDouble();
        acc.withdraw(newWithdraw);
        System.out.println("Updated account data: ");
        System.out.println(acc);

        sc.close();
    }
}
