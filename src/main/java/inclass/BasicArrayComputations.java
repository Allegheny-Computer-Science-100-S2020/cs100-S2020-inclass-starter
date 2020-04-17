package inclass;

/**
 * This class has a method that shows array declaration and use.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 * @author Gregory M. Kapfhammer
 * @author Add Your Name Here
 */

public class BasicArrayComputations {

  /** Declare variables that control array printing. */
  private static final int LIMIT = 15;
  private static final int MULTIPLE = 10;

  /**
   * Demonstrate the use of the array container and the use of loops.
   * Read the documentation in the README to learn about this program.
   * TODO: From your "home base", you can run this program with:
   * gradle runBasicArrayComputations
   */
  public static void main(String[] args) {

    // TODO: Add comments to the source code of this method

    int[] list = new int[LIMIT];

    for (int index = 0; index < LIMIT; index++) {
      list[index] = index * MULTIPLE;
    }

    list[5] = 999;

    for (int value : list) {
      System.out.print(value + "  ");
    }

    System.out.println();

  }

}

// TODO: This is the output from running this program:

// What is the purpose of the LIMIT variable?
//
// TODO: Provided a first sentence.
// TODO: Provided a second sentence.

// What is the purpose of the MULTIPLE variable?
//
// TODO: Provided a first sentence.
// TODO: Provided a second sentence.
