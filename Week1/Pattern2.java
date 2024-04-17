package Week1;

public class Pattern2 {
    public static void main(String[] args) {
        printPattern(4, 9); // Adjust the parameters to change the number of rows and columns
    }

    public static void printPattern(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
