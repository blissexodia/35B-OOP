package Week2;
 /*Task
  * Make a new scanner object/variable scan1
  prompt the following
  What is your name? -> save as string, name
  Are you over 18? -> save as int, sibling
  Print the following
  Hello, {Name}
  Over 18? {Status}
  You have sibling {Number of sibling}
  //commit the previous scanner for case of use
  */

import java.util.Scanner;

public class TaskApril21st {
    public static void main(String[] args) {
        // Create a new scanner object/variable scan1
        Scanner scan1 = new Scanner(System.in);

        // Prompt for name
        System.out.println("What is your name?");
        // save as string, name
        String name = scan1.nextLine();

        // Prompt for age
        System.out.println("Are you over 18? (Enter 1 for Yes, 0 for No)");
        // save as int, sibling
        int sibling = scan1.nextInt();

        // Commit the previous scanner for later use
        scan1.nextLine(); // consume the newline character left by nextInt()

        // Print the information
        System.out.println("Hello, " + name);
        // Over 18? {Status}
        String status = (sibling == 1) ? "Yes" : "No";
        System.out.println("Over 18? " + status);
        // You have sibling {Number of sibling}
        System.out.println("You have sibling " + sibling);

        // Close the scanner
        scan1.close();
    }
}
 {
    
}
