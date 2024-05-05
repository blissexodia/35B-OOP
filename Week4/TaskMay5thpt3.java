package Week4;
/*Task
 * Loop from 1-20
 * print the number only if even
 * use continue to complete
 */
public class TaskMay5thpt3 {
    public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
        if (i % 2 != 0) {
            continue; // Skip odd numbers
        }
        System.out.println(i);
    }
}
}

