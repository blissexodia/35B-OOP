package Week6;

public class MultiDimArrayLoop {
     public static void main(String[] args) {
        int[][] twoArray = new int[2][3];
        twoArray[0][0] = 10;
        twoArray[0][1] = 20;
        twoArray[0][2] = 30;
        twoArray[1][0] = -30;
        twoArray[1][1] = -20;
        twoArray[1][2] = -10;
        /* Visual
         * [
         *  [10,20,30],
         *  [-30, -20, -10]
         * ]
         */

        /* Loop multi dim array with nested loop */
        /* Outer selects the array, inner selects the actual value inside */
        int outerLength = twoArray.length;
        for (int outer = 0; outer < outerLength; outer++) {
            int innerLength = twoArray[outer].length;
            for (int inner = 0; inner < innerLength; inner++) {
                System.out.println(twoArray[outer][inner]);
            }
        }
    }
}
