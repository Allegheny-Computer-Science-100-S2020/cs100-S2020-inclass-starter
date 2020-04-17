package inclass;

import java.util.Scanner;

/**
 * This class has a method reads in numbers, stores them in a list,
 * reverses the numbers, and then outputs the reversed list of values.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 * @author Gregory M. Kapfhammer
 * @author Add Your Name Here
 */

public class ReverseNumberList {

  /**
   * Demonstrate the use of the Scanner class to read user input, store
   * the input values in an array, and then output the reversed list.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle -q --console plain runReverseNumberList
   */
  public static void main(String[] args) {
    // TODO: Add comments to explain this program

    Scanner scan = new Scanner(System.in);

    int amountOfNumbers = 5;
    double[] numbers = new double[amountOfNumbers];

    System.out.println("You must enter a total of " + numbers.length + " decimal numbers.");

    for (int index = 0; index < numbers.length; index++) {
      System.out.print("Enter decimal number " + (index + 1) + ": ");
      numbers[index] = scan.nextDouble();
    }

    System.out.println("The decimal numbers in reverse order:");
    for (int index = numbers.length - 1; index >= 0; index--) {
      System.out.print(numbers[index] + "  ");
    }
    System.out.println();

  }

}

// TODO: Provide the output from running the program

// TODO: What happens if you run the program and input an integer?

// TODO: Provide an answer to this question.

// TODO: What happens if you run the program and input a String?

// TODO: Provide an answer to this question.
