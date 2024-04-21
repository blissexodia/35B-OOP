package Week2;
/* Write a program to print the area and parimeter of rectangle
 * area = length * breadth
 * parimeter - 2(length + breadth)
*/
public class Task3 {
    public static void main(String[] args) {
        // Variables for length and breadth of the rectangle
        double length = 5.0;
        double breadth = 3.0;

        // Calculate area
        double area = length * breadth;

        // Calculate perimeter
        double perimeter = 2 * (length + breadth);

        // Print the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

