import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: "); 
        int number = scanner.nextInt(); // Read user input

        // Determine if the number is even or odd and display the correct output
        if (number % 2 == 0) {
            System.out.println("\nEnter an integer: " + number);
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println("\nEnter an integer: " + number);
            System.out.println(number + " is an Odd number.");
        }

        scanner.close(); // Close the scanner
    }
}
