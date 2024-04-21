package Week2;
/*Write a prgoram to print simple interest from variables
 * Make 3 variables for; amount, time and rate and save the calculation into SI
 * Formula SI = amount * time * rate/ 100; //use float/double
 */
public class Task2 {
    public static void main(String[] args) {
        // Variables for amount, time, and rate
        double amount = 1000.0; // Initial amount
        double time = 2.5; // Time in years
        double rate = 5.5; // Rate of interest in percentage

        // Calculate simple interest
        double SI = (amount * time * rate) / 100.0;

        // Print the result
        System.out.println("Simple Interest is Rs: " + SI);
    }
}
