package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        System.out.println("Hello World");
        // 1. Get the number of hours worked - Variable(Memory location that stores data)- declare data type
        int hours = 40;// hard coded

        int hour = 0; // default value- user to input value -use scanner
        System.out.println("How many hours did you work?"); //prompt
        Scanner scanner = new Scanner(System.in);
        hour = scanner.nextInt();

        // 2. Get the hourly pay rate
        double payRate = 25.50;
        double pay = 0;
        System.out.println("What is you pay per hour?");
        pay =scanner.nextInt();
        scanner.close();

        // 3. Multiply the hourly pay rate
        double grossPay = hours * payRate;
        double grossP = hour * pay;
        // 4. Display result
        System.out.println("Gross pay: " + grossPay);
        System.out.println("Gross pay: " + grossP);
        // boolean isWaterWet; = var isWaterWet= true;/ var must be initialised
    }
}
