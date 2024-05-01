package pl.pp;

import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static int calculateSquareSum(int lowerLimit, int upperLimit) {
        int squareSum = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            squareSum += i * i;
        }
        return squareSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Upper limit should be greater than lower limit. Exiting.");
                break;
            }

            int result = calculateSquareSum(lowerLimit, upperLimit);
            System.out.println("The sum of the squares from " + (lowerLimit * lowerLimit) + " to " + (upperLimit * upperLimit) + " is " + result);
        }
        scanner.close();
    }
}





