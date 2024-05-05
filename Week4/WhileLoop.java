package Week4;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while(count < 3){
            System.out.println("While Count" + count);
            ++ count;
        }
        /*When using while with variable, increment and decrement are done inside the loop
         */
        /*The main use of whileloop is when you do not know how many time the loop 
         * to iterate, for eg: Asking user for a number until some condition
         * is match, like 0=100
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number");
        int inputInt = scan.nextInt();
        while(inputInt < 0 || inputInt >100){
            inputInt = scan.nextInt();
        }
        System.out.println("Condition Matched" + inputInt);
        scan.close();
    }
    
}
