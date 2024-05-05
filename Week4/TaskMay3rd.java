package Week4;
/*Make a multiplication table of 2
 * for eg:
 * 2 x 1 = 2
 * 2 x 2 = 4
 * ;;
 * till 2 x 10 = 20
 * note: loop from 1 to 10 and multiply the index
 */
public class TaskMay3rd {
        public static void main(String[] args) {
            System.out.println("Multiplication table of 2:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 x " + i + " = " + (2 * i));
            }
        }
}