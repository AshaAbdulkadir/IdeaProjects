package games;

import java.util.Scanner;

// For loop
public class Cashier {

    public static void main(String[] args) {

        //Get number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all the items and accumulate the costs
        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextInt();

            total = total + price;

        }
        scanner.close();
        System.out.println("Your Total is $" + total);
    }
}
