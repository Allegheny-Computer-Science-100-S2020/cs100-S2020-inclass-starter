package inclass;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This class has a method that accepts user input and displays it as output.
 * The program will make a prompt, accept input and then make another prompt
 * and accept input another time. This program can calculate an average.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Add Your Name Here
 */
public class ComputeAverage {

  /**
   * Demonstrate the use of the Scanner class to read user input.
   * Read the documentation in the README to learn about this program.
   * TODO: From your "home base", you can run this program with:
   * gradle -q --console plain runComputeAverage
   */
  public static void main(String[] args) {
    int sum = 0;
    int value;
    int count = 0;
    double average;

    // TODO: Describe
    Scanner scan = new Scanner(System.in);

    // TODO: Describe
    System.out.print("Enter an integer (0 to quit): ");
    value = scan.nextInt();

    // TODO: Describe
    while (value != 0) {
      count++;
      sum += value;
      System.out.println("The sum so far is " + sum);
      System.out.print("Enter an integer (0 to quit): ");
      value = scan.nextInt();
    }

    // TODO: Describe
    System.out.println();

    // TODO: Describe
    if (count == 0) {
      System.out.println("No values were entered.");
    } else {
      // TODO: Describe
      average = (double)sum / count;
      DecimalFormat fmt = new DecimalFormat("0.###");
      // TODO: Add the code to print the line with the fmt object
      System.out.println("The average is " + average);
    }
  }
}
