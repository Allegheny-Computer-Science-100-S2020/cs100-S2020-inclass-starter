package inclass;

import java.util.Date;

// TODO: Make sure that you add your name to this file.

/** This class explores different data types.
 *  The first lines of code will declare variables. Then, the program will
 *  try to assign a value to a variable that is declared as a constant.
 *
 * <p>Bugs: This program has no known bugs, but it is missing code.
 *
 * @author Add Your Name Here
 */

public class ExploreDataTypes {

  /** The main entry point for ExploreDataTypes.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output
   *  about the creation and use of different data types.
   *
   * @param args The command-line arguments
   **/
  public static void main(String[] args) {
    // TODO: Explain the purpose of the next three lines of code
    int age = 19;
    double pi = 3.14159265358979;
    float weight = 122.5f;
    // TODO: Explain the purpose of the next two lines of code
    String name = "Gregory M. Kapfhammer";
    String space = " ";
    // TODO: reorder the print statements to make the program
    // produce output that matches the expected output
    // TODO: See the GitHub repository for this project to
    // learn more about what the expected output should look like
    System.out.println("Pi: " + pi);
    System.out.println("Weight: " + weight);
    System.out.println("Age: " + age);
    System.out.println(name + space);
  }

}
