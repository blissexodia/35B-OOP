package Week4;
/*Task
 * loop from -5 to 5
 * break the loop if the value is positive
 */
public class TaskMay5thpt2 {
    public static void main(String[] args) {
        for (int i = -5; i <= 5; i++) {
            if (i > 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
