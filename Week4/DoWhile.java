package Week4;

public class DoWhile {
    public static void main(String[] args) {
        /* Check the ssame condition in while and do while for difference */
        int counter = 0;
        while(counter <0){
            System.out.println("THe condition is false, it won't run");
        }
        do{
            System.out.println("This runs first then checks the condition");
        }while(counter <0);
        /*DO while run at least once, even if the condition is false */
    }
    
}
