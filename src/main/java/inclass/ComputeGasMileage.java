package inclass;

import java.util.Scanner;

// TODO: Make sure that you add your name to this file.

/**
 * This class has a method that accepts user input and displays it as output.
 * The program will make a prompt, accept input and then make another prompt
 * and accept input another time. This program can calculate gas mileage.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 * @author Add Your Name Here
 */
public class ComputeGasMileage {

  /**
   * Demonstrate the use of the Scanner class to read user input.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle -q --console plain runComputeGasMileage
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // prompt the user for the number of miles
    int miles;
    System.out.print("Enter the number of miles: ");
    miles = scan.nextInt();
    // prompt the user for the number of gallons of fuel
    double gallons;
    System.out.print("Enter the gallons of fuel used: ");
    gallons = scan.nextDouble();
    // TODO: perform a computation for the miles per gallon
    // TODO: display the miles per gallon
    // TODO: Refer to your other Java programs for examples
    // on how to complete both of these remaining steps
  }
}
