package Week4;

import java.util.Scanner;

/*Prompt user to enter a number
 * run loop and ask user the integer until the
 * integer is negative
 */

public class TaskMay5th{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("You entered a negative number. Exiting loop.");
                break;
            } else {
                System.out.println("You entered: " + num);
            }
        }
        
        scanner.close();
    }
}
