package Week11;
public class ExceptionHandling{
    public static void main(String[] Args){
        System.out.println("Program start");
        int num1 = 10;
        try{
            int num2 = 10/0; // Arthematic exception - exits here
        }catch(ArithmeticException e){
            // ex will have the system generated msg
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Finally runs whether exception occurs or not");
        }
        // Note: catch and finally is optinal, but , either or both should be present after try
        int[] numA = new int[5];
        numA[0] = 100;
        try{
            numA[100] = 1000; // ArrayIndexOutOfBoundsException - exits heres
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array is not long enough");
        }

        String data = null;
        try {
            System.out.println(data.length()); // Null pointer exception
        } 
        catch(NullPointerException ex) {
            System.out.println("Null Value");
        }
        // Multi layered exception
        try {
            int numMulti = 1000/0; // Arithemetic exception
            String d2 = null; // Null pointer exception
            System.out.println(d2.length());
        } catch (ArithmeticException e) {
            System.out.println("Number error");
        }catch(NullPointerException e){
            System.out.println("Null ayo");
        }
        finally {
            System.out.println("Try end");
        }

        System.out.println("Program end");
    }
}