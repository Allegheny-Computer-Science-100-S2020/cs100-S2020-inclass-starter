package inclass;

import java.util.Scanner;

// TODO: Carefully read and understand the source code of this program

/**
 * This class has a method that displays a triangle using star characters.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class DisplayStars {

  // TODO: Make sure that you run the program as given below and then
  // study the output to ensure that you see how the code produces the output

  /**
   * Read in a numerical value and complete the multiples of it.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle runComputeMultiples
   */
  public static void main(String[] args) {

    int maximumRows = 10;

    // describe the purpose of the nested for loops
    for (int row = 1; row <= maximumRows; row++) {
      for (int star = 1; star <= row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}

// TODO: Please provide the output from running this program

// TODO: Please make sure that you provide the output in the
// form of a block of single-line comments
