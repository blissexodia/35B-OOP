package Week9;

public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.firstname = "XYZ";
        cc.lastname = "ANC";
        cc.expence = 100.11;
        //cc.salary = 10000;
        cc.info();
        cc.detail();
    }
}

class ParentClass{
    public String lastname;
    private int salary;
    protected double expence;
    void info(){
        System.out.println("Parent Function "+ lastname);
    }
}
// To use inheritance use the keyword "extends"
// single level inheritance, one parent/super - one child/sub

class ChildClass extends ParentClass{
    String firstname;
    void detail(){
        System.out.println(firstname + " "+ lastname);
    }
}