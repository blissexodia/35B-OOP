package Week2;
public class OperatorClass {
    public static void main(String[] args) {
        /*Arthematic Operators*/
        int aNum1 = 10, aNum2 = 20;
        int sum = aNum1 + aNum2; /*"+" is an arethematic operator */
        System.out.println("Addition is "+ sum);
        System.out.println("Substraction is" + (aNum1 - aNum2));
        System.out.println("Multiplication is" + (aNum1 * aNum2));
        System.out.println("Division is" + (aNum1/aNum2));
        System.out.println("Mudulo is" + (aNum1 % aNum2));

        /*Assignment Operator */
        int asNum1 = 20; // = is used to assign a value to variable
        asNum1+=1; // sume asNum1 = asNum1 + 1;
        System.out.println("+= value is" + asNum1);
        System.out.println("-= value is" + (asNum1-=10));
        System.out.println("+= value is" + (asNum1*=10));
        System.out.println("+= value is" + (asNum1/=2));
        System.out.println("+= value is" + (asNum1%=3));
        
        /*Relational Operator */
        int rNum1 = 20, rNum2 = 21;
        boolean rExpression = rNum1 == rNum2; // returns true/false
        System.out.println("Equal to" + rExpression);
        System.out.println("Greater than" + (rNum1 > rNum2));
        System.out.println("Less than" + (rNum1 < rNum2));
        System.out.println("Not equal to" + (rNum1 != rNum2));
        System.out.println("Greater than equal to" + (rNum1 >= rNum2));

        /*Logical Operator */
        int lNum1 = 20, lNum2 = 20;
        boolean lExpession1 = lNum1 == lNum2;
        boolean lExpession2 = lNum1 > lNum2;
        System.out.println("&& is used for AND" +(lExpession1 && lExpession2));
        System.out.println("|| is used for OR" + (lExpession1 || lExpession2));
        System.out.println("! is use for NOT" + (lExpession1));

        /*Unary Operator */
        int uNum1 = 10;
        ++uNum1; // changes value in next line
        System.out.println("--uNum1 unary is" + --uNum1);
        System.out.println("uNum1 --unary is" +uNum1--);

        /* Ternary Operator */
        int tNum1 = 20, tNum2 = 10;
        String output;
        /* Take following if else as example
         * if (tNum1 > tNum2){
         * output = "True Statement";
         * }else{
         * output -"False Statement
         * "}
         */
        output = tNum1 > tNum2 ? "True Statement": "False Statement";
        /*Here ternary operator contains expression
         * If expression is ture it returns the "?"
         * If the expression is false it returns after the ":"
         */
        int intOutput = tNum2 == tNum1 ? -10 : 10;
        System.out.println(output);
        System.out.println(intOutput);
    }
    
}
