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
        System.out.print("Problem 1: Determining quadrant based ");
        System.out.println("on x & y coordinates.");
        System.out.print("Problem 2: Decimal number placement on");
        System.out.println(" on basis of user input.");

        // Declare variables.
        final String opOne = "1";
        final double zeroOp = 0;
        final String opTwo = "2";

        // Creates a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Get user input.
        System.out.println("Which one would you like to do? (1 or 2): ");
        final String userSelector = scanner.nextLine();

        // If statement to see which option user selects.
        if (userSelector.equals(opOne)) {

            // Receive user input.
            System.out.println("");
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

                    // If statement to determine quadrant on basis
                    // of user input. It then displays the corresponding.
                    // quadrant.
                    if (xCoordDoub >= zeroOp && yCoordDoub > zeroOp) {
                        System.out.print("For the point, (" + xCoordStr
                                + ", " + yCoordDoub + ")");
                        System.out.println(", it lies in the first quadrant.");
                    } else if (xCoordDoub < zeroOp && yCoordDoub > zeroOp) {
                        System.out.print("For the point, (" + xCoordStr
                                + ", " + yCoordDoub + ")");
                        System.out.println(", it lies in the second quadrant.");
                    } else if (xCoordDoub < zeroOp && yCoordDoub < zeroOp) {
                        System.out.print("For the point, (" + xCoordStr
                                + ", " + yCoordDoub + ")");
                        System.out.println(", it lies in the third quadrant.");
                    } else if (xCoordDoub > zeroOp && yCoordDoub < zeroOp) {
                        System.out.print("For the point, (" + xCoordStr
                                + ", " + yCoordDoub + ")");
                        System.out.println(", it lies in the fourth quadrant.");
                    } else if (xCoordDoub == zeroOp && yCoordDoub == zeroOp) {
                        System.out.print("For the point, (" + xCoordStr
                                + ", " + yCoordDoub + ")");
                        System.out.println(" it lies in the origin.");
                    } else {
                        // Display error.
                        System.out.print("Please enter a valid coordinate(s).");
                    }

                } catch (NumberFormatException error) {
                    // Displays error to user.
                    System.out.print("Refrain from invalid input."
                            + error.getMessage());
                }

            } catch (NumberFormatException error) {
                // Display error to user.
                System.out.print("Please enter valid input."
                        + error.getMessage());
            }
            // Executes when user selects option two.
        } else if (userSelector.equals(opTwo)) {
            System.out.print("This program tells you if the two");
            System.out.print(" decimals numbers entered are up to the same");
            System.out.println(" decimal places!");

            // Receive user input.
            System.out.print("Enter the first decimal number: ");
            final String numOneStr = scanner.nextLine();

            // Usage of try catch to detect errors.
            try {
                // Convert from string to double.
                final double numOneDoub = Double.parseDouble(numOneStr);

                // Receive user input.
                System.out.print("Enter the second decimal number: ");
                final String numTwoStr = scanner.nextLine();

                try {
                    // Convert from string to double.
                    final double numTwoDoub = Double.parseDouble(numTwoStr);

                    // Round to 3 decimal places before comparison
                    // trim any trailing zeros.
                    final String numOne = String.format("%.3f", numOneDoub).trim();
                    final String numTwo = String.format("%.3f", numTwoDoub).trim();

                    // If statement to see if numbers are the same
                    // up to the decimal places.
                    if (numOne.equals(numTwo)) {
                        System.out.println("For the numbers, " + numOne + " and " +
                                numTwo + " these numbers are the same!");
                    } else {
                        System.out.println("The numbers aren't the same.");
                    }

                } catch (NumberFormatException error) {
                    // Displays error to user.
                    System.out.print("Valid inputs only!"
                            + error.getMessage());
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Invalid, please enter valid input. "
                        + error.getMessage());
            }
            // Executes if user does not select one of the options.
        } else {
            System.out.print("Please select either or option.");
        }
        scanner.close();

    }
}

