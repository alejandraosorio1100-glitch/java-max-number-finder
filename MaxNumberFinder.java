package daniela.control;
import java.util.Scanner;

/**
 * This program reads an integer N followed by N numbers.
 * It identifies and prints the largest number among them.
 * 
 * Satisfies Indicator 4: Use of control structures (for, if).
 * Satisfies Indicator 2: Construction of boolean expressions for problem solving.
 */
public class MaxNumberFinder {

    public static void main(String[] args) {
        // Scanner instance to read data from standard input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of numbers (N): ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("N must be a positive integer.");
            } else {
                System.out.println("Enter " + n + " numbers:");

                long maxValue = scanner.nextLong();

                for (int i = 1; i < n; i++) {
                    long currentValue = scanner.nextLong();

                    if (currentValue > maxValue) {
                        maxValue = currentValue;
                    }
                }

                System.out.println("The largest number is: " + maxValue);
            }
        }

        scanner.close();
    }
}
 