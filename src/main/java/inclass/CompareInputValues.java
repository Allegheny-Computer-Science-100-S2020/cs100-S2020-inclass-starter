package inclass;

import java.util.Scanner;

/**
 * This class has a method that accepts user input and displays a message as output.
 * The program will make a prompt, accept input and then make another prompt
 * and accept input another time. This program then determines if values are equal.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Add Your Name Here
 */
public class CompareInputValues {

  /**
   * Demonstrate the use of the Scanner class to read user input.
   * This program should read in two values and then compare them,
   * ultimately printing whether or not they are equal to each other.
   * Read the documentation in the README to learn about this program.
   * TODO: From your "home base", you can run this program with:
   * gradle -q --console plain runCompareInputValues
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // prompt the user for first variable
    int first;
    System.out.print("Enter the first value: ");
    first = scan.nextInt();
    // prompt the user for the second variable
    int second;
    System.out.print("Enter the second value: ");
    second = scan.nextInt();
    // if the two values are the same print the fact,
    // otherwise, print that the values are different
    if ( first == second ) {
      System.out.println("Hooray, the values are the same!");
    } else {
      System.out.println("Sorry, the values are not the same!");
    }
  }
}
