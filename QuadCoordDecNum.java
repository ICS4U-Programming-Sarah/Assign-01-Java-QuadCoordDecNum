import java.util.Scanner;

/**
* This program receives user guess from user.
* From information given, it checks to see if guess
* is the same as random number generated.
*
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-02-26.
*/

public final class QuadCoordDecNum {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private QuadCoordDecNum() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Introduction.
        System.out.println("Today, we will be two problems.");
        System.out.println("Problem 1: Determining quadrant based on  x & y coordinates.");
        System.out.println("Problem 2: Decimal number on basis of input.");

        // Declare variables. 
        final String opOne = "1";

        // Creates a new scanner
        final Scanner scanner = new Scanner(System.in);
        
        // Get user input.
        System.out.println("Which one would you like to do? (1 or 2): ");
        final String userSelector = scanner.nextLine();
        
        // If statement to see which option user selects.
        if (userSelector.equals(opOne)) {

            // Receive user input.
            System.out.print("Please enter the (x) coordinate: ");
            final String xCoordStr = scanner.nextLine();
            // Try catch to detect error.
            try {
                // Convert from string to double.
                final double xCoordDoub = Double.parseDouble(xCoordStr);

                // Receive user input.
                System.out.print("Please enter the (y) coordinate: ");
                final String yCoordStr = scanner.nextLine();

                try {
                    // Convert from string to double.
                    final double yCoordDoub = Double.parseDouble(yCoordStr);

                    if (xCoordDoub > 0 && yCoordDoub > 0) {
                        System.out.print("For the point " + xCoordStr + yCoordDoub +
                            "it lies in the first quadrant.");
                    }
                    
                } catch (NumberFormatException error) {
                    System.out.print("Refrain from invalid input."
                            + error.getMessage());
                }

            } catch (NumberFormatException error) {
                // Display error to user.
                System.out.print("Please enter valid input."
                        + error.getMessage());
            }

        } 
    


    }
}
