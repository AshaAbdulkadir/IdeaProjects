package games;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args){

        // declared variable for US coins and initialized with their monetary value
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println ("Enter your number of pennies: ");
        int numOfPennies = scanner.nextInt();

        System.out.println ("Enter your number of nickels: ");
        int numOfNickels = scanner.nextInt();

        System.out.println ("Enter your number of dime: ");
        int numOfDimes = scanner.nextInt();

        System.out.println ("Enter your number of quarters: ");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny
                + numOfNickels * nickel
                + numOfDimes * dime
                + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;

            //Way to make decimal print with only 2 decimal places
            System.out.println ("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;

            System.out.println ("Sorry, you lose! You were over " + String.format("%.2f", amountOver) +" cents.");
        }
        else{
            System.out.println ("Yay! That's exactly $1.00! You win!");
        }
    }
}
