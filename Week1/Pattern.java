/*WAP that prints the following pattern:

*

**

***

**** */
package Week1;
public class Pattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}