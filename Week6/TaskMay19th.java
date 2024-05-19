package Week6;
/* Make the following array
 * [
 * [10, -10],
 * [20, -20],
 * [-30, 0],
 * [40, 45],
 * [50, 56]
 * ]
 * print the value 50, 56
 */
 public class TaskMay19th{
     public static void main(String[] args) {
         // Create the 2D array
         int[][] array = {
             {10, -10},
             {20, -20},
             {-30, 0},
             {40, 45},
             {50, 56}
         };
 
         // Print the values 50 and 56
         System.out.println("Value 50: " + array[4][0]);
         System.out.println("Value 56: " + array[4][1]);
     }
 }