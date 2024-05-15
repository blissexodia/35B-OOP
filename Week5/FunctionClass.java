package Week5;

public class FunctionClass {
    
/* Function are made inside a class scope
 * above or below main not
 */ 
    void printSomething(){
        System.out.println("This function prints");

    }
    /*with return type*/
    int returnInt(){
        int value = 10;
        return value;
    }
    double addValue(int num1 , double num2){
        double sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        /* To call a normal/non static function we need to create object
         * just remember the syntax for now
         */
        FunctionClass fc = new FunctionClass();
        /* Call function from object / Variable of function */
        fc.printSomething();
        /* can call multiple times */
        fc.printSomething();
        int returnFromFunction = fc.returnInt();
        System.out.println("Return from function is" +returnFromFunction);
    }
   
}