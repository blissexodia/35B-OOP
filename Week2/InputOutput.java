package Week2;
import java.util.Scanner;
/*
 * or use
 * import java.util,*;// imports all utils
 */
public class InputOutput{
    public static void main(String[] args) {
        

    /*User output
     * System.output.println("Print next line");
     * "soul" for shortcut
     */
    System.out.println("This string breaks line");
    /*system.out.printf
     * String formatter
     * %s string, %d Integral, % floating point, %b boolean
     */
    System.out.printf("Hello %s, nice","World");
    System.out.printf("This is num %d",10);
    /* You an use muliple formatter */
    System.out.printf("Num %f amd bppl %b", 10.3f, false);
    /*User Input */
    Scanner scan = new Scanner(System.in);
    System.out.println("The following takes whiole sentence");
    String wholeWString = scan.nextLine();
    System.out.println("The input is" + wholeWString);
    System.out.println("the following Takes integer");
    int intInput = scan.nextInt();
    System.out.println("The input is" + intInput);
    System.out.println("The following takes double");
    double doubleInput = scan.nextDouble();
    System.out.println("The input is" + doubleInput);
    System.out.println("The following takes boolean");
    boolean booleanInput = scan.nextBoolean();
    System.out.println("The input is" + booleanInput);
    scan.close(); //close after taking all the input

}
}