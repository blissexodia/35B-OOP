package Week3;

public class IfElseClass {
    public static void main(String[] args) {
        /*IF statement */
        if(true){
            System.out.println("True Statement");
        }
        /*IF takes boolean expression inside () */
        int num1 = 10, num2 = 20;
        if(num1 == num2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        /*Note that else is optional */
        /*If else if */
        if(num1 == num2){
            System.out.println("Equal");
        }else if(num1 < num2){
            System.out.println("Lesser");
        }else{
            System.out.println("Greater");
        }
        /* Note that else should be at the last */
        /* If else is ladder */
        if(num1 > num2){
            System.out.println("Greater");
        }else if(num1 !=num2){
            System.out.println("Not Equal");
        }else if(num1 == num2){
            System.out.println("Equal");
        }else{
            System.out.println("Defailt Statement");
        }
        /* Nested if Statement */
        if (num1 < num2){
            if (num1 > num2){
                System.out.println("Negative and greater");
            } else {
                System.out.println("Negative and lesser");
            }
        } else {
            if (num1 > num2){
                System.out.println("Positive and greater");
            } else {
                System.out.println("Postive and lesser");
            }
        }
    }
}