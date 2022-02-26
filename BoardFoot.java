/*
* This is BoardFoot program.
*
* @author  Abdul Basit Butt
* @version 1.0
* @since   2022-02-15
* Class BoardFoot.
*/

import java.util.Scanner;

/**
* This is the calculating heating time program.
*/
final class BoardFoot {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting boardCalculator() function.
    *
    * @param width is width
    * @param height is height
    *
    * @return length
    */
    static double boardCalculator(final double width, final double height) {
        final double boardFoot = 144.0;

        final double length = boardFoot / (width * height);

        return length;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        try {
            final Scanner input = new Scanner(System.in);
            System.out.println(
                "What is the width of the wood?"
            );

            final double width = Double.parseDouble(input.nextLine());

            System.out.println(
                "What is the height of the wood?"
            );

            final double height = Double.parseDouble(input.nextLine());

            final double length = boardCalculator(width, height);

            System.out.println(
                "\nThe length to make it an one board foot of wood is :"
                + length + " inches."
            );
        } catch (java.lang.NumberFormatException error) {
            System.out.println("\nThere was an error: " + error);
        }
        System.out.println("\nDone.");
    }
}
