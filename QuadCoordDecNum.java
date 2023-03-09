import java.util.Scanner;

/**
* This program asks the user for (x,y) coordinates,
* it then displays what quadrant the point resides in.
* It also asks the user for two decimal numbers &
* tells user if it is the same number up to three decimal places.
*
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-03-07.
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
        System.out.println("Today, we will be doing two problems.");
        System.out.print("Problem 1: Determining quadrant based ");
        System.out.println("on x & y coordinates.");
        System.out.print("Problem 2: Decimal number placement on");
        System.out.println(" on basis of user input.");

        // Declare variables.
        final String opOne = "1";
        final double zeroOp = 0;
        final String opTwo = "2";
        String quesAns = " ";

        // Creates a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Get user input.
        System.out.println("Which one would you like to do? (1 or 2): ");
        final String userSelector = scanner.nextLine();

        // Do while to reload upon false input.
        do {
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
                        if (xCoordDoub > zeroOp && yCoordDoub > zeroOp) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.print(", it lies in the first.");
                            System.out.println(" quadrant.");
                        } else if (xCoordDoub < zeroOp && yCoordDoub > zeroOp) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.print(", it lies in the second.");
                            System.out.println(" quadrant.");
                        } else if (xCoordDoub == zeroOp
                            && yCoordDoub > zeroOp) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.print(", it lies within");
                            System.out.println(" the positive y axises.");
                        } else if (xCoordDoub > zeroOp
                            && yCoordDoub == zeroOp) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.print(", it lies within");
                            System.out.println(" the positive x axises.");
                        } else if (xCoordDoub == zeroOp
                            && yCoordDoub < zeroOp) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.print(", it lies within");
                            System.out.println(" the negative y axises.");
                        } else if (xCoordDoub < zeroOp && yCoordDoub == 0) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.print(", it lies within the");
                            System.out.println(" negative x axises.");
                        } else if (xCoordDoub < zeroOp && yCoordDoub < zeroOp) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.print(", it lies in the");
                            System.out.println(" third quadrant.");
                        } else if (xCoordDoub > zeroOp && yCoordDoub < zeroOp) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.print(", it lies in the");
                            System.out.println(" fourth quadrant.");
                        } else if (xCoordDoub == zeroOp
                            && yCoordDoub == zeroOp) {
                            System.out.print("For the point, (" + xCoordStr
                                    + ", " + yCoordDoub + ")");
                            System.out.println(" it lies in the origin.");
                        } else {
                            // Display error.
                            System.out.print("Please enter a valid ");
                            System.out.println(" coordinate(s).");
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
                System.out.print(" decimals numbers entered are");
                System.out.print(" up to the same");
                System.out.println(" decimal places including the number!");

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
                        final double numOne = Double.parseDouble(
                            String.format("%.3f", numOneDoub));
                        final double numTwo = Double.parseDouble(
                                String.format("%.3f", numTwoDoub));
                        // If statement to see if numbers are the same
                        // up to the decimal places.
                        if (numOne == numTwo) {
                            System.out.println("For the numbers, " + numOne
                                    + " and " + numTwo
                                    + " these numbers are the same!");
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
            // Executes problem in order for user to do it again.
            do {
                System.out.println("Would you like to play again? (y/n): ");
                // Receive user input.
                quesAns = scanner.nextLine();
                // If statement checking to see what user enters.
                // If enters no, display below.
                if ("n".equals(quesAns)) {
                    System.out.print("Thanks for playing!");
                    System.out.print("");
                }
                // Checks for invalid cases in case user does not
                // enter a y or n.
                if (!"y".equals(quesAns) && !"n".equals(quesAns)) {
                    // Displays error to user.
                    System.out.print("Invalid, please enter y or n.");
                    System.out.print("");
                }
            } while (!"y".equals(quesAns) && !"n".equals(quesAns));
        } while ("y".equals(quesAns));
        scanner.close();
    }
}

