package Week10;
// Find the bug in the following
public class FindTheBug{
    public static void main(String[] args){
        // Computer c1 = new Computer();
    }
}
abstract class Computer{
    abstract public void on(boolean on);
    abstract boolean off(String state);
    abstract double upgrade(double ram);
    void modelNo(){

    }
}
class AppleM3 extends Computer{
    @Override
    public void on(boolean on){
        
    }
    @Override
    void modelNo(){
        
    }
    @Override
    boolean off(String state){

    }
    @Override
    double upgrade(double ram){

    }
}
