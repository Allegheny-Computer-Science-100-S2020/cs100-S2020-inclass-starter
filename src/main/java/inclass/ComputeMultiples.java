package inclass;

import java.util.Scanner;

// TODO: Carefully read and understand the source code of this program

/**
 * This class has a method that accepts numerical user input and then calculates
 * and displays the multiples of that numerical value.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class ComputeMultiples {

  // TODO: Make sure that you run the program as given below and then
  // study the output to ensure that you see how the code produces the output

  /** Configure the number of outputs per line. */
  private static final int PER_LINE = 5;

  /**
   * Read in a numerical value and complete the multiples of it.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle -q --console plain runComputeMultiples
   */
  public static void main(String[] args) {
    int value;
    int count = 0;

    // explain
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive value: ");
    value = scan.nextInt();

    // explain
    int limit;
    System.out.print("Enter an upper limit: ");
    limit = scan.nextInt();

    // explain
    System.out.println();
    System.out.println("The multiples of " + value + " between "
                       + value + " and " + limit + " (inclusive) are:");

    // explain
    int mult;
    for (mult = value; mult <= limit; mult += value) {
      System.out.print(mult + "\t");

      // Print a specific number of values per line of output
      count++;
      if (count % PER_LINE == 0) {
        System.out.println();
      }
    }
  }
}

// TODO: Provide a block of single-line comments that showcases the output from
// running this program See page 268 in the textbook for an example of inputs
// for running this program

// TODO: You should input the values that are listed beleow

// Enter a positive value: 7
// Enter an upper limit: 400

// TODO: Please provide the full output from running the program
