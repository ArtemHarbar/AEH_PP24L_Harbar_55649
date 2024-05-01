package pl.pp;

import java.util.Scanner;

public class mojaCzwartaAplikacja2programm  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please enter a valid option.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
            }

            System.out.print("Do you want to try again? (yes/no): ");
            String tryAgain = scanner.next();
            if (!tryAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        scanner.close();
    }
}