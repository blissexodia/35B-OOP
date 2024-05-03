package Week4;

public class ForLoop{
    public static void main(String[] args) {
        /* For loop takes initialization
         * condition
         * modify/update
         */
        for(int index = 0; index <=5; index ++){
            System.out.println("For Index" + index);
        }
        /* can use different update logic like
         * for(int index = 0; index <=5 ; index += 3)
         */
        /* Using decrement */
        for(int index = 10; index >=0; index --){
            System.out.println("For Index Decrement" + index);
        }
        /* Nested for loop
         * Using for loop inside the scope of for loop
         */
        for(int outer = 0; outer < 2; outer++){
            for(int inner = 3; inner > 0; inner--){
                System.out.println("Inner Index" + inner);
            }
            System.out.println("Outer Index" + outer);
    }
}
}
