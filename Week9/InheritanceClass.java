package Week9;

public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.firstname = "XYZ";
        cc.lastname = "ANC";
        cc.expenses = 100.11;
        // cc.salary = 10000; 
        cc.info();
        cc.detail();

        Labrador l = new Labrador();
        l.name = "Tom";
        l.breed = "Husky";
        l.country = "Nepal";
        l.color = "White";
        l.play();
    }
}

class ParentClass {
    public String lastname;
    private int salary;
    protected double expenses;

    void info() {
        System.out.println("Parent Function "+lastname);
    }
}
// To use inheritance use the keyword 'extends'
// single levele inheritance, one parent/super = one child/sub
class ChildClass extends ParentClass{
    String firstname;
    void detail() {
        System.out.println(firstname+" "+lastname);
    }
}
// Multi level inheritance, nested class, child class has another child class
class GrandChildClass extends ChildClass {
    String middlename;
    void description(){
        System.out.println(firstname +" "+middlename+" "+lastname);
    }
}
// Tree/heirarical inheritance
// One parent, multiple children
class BrotherClass extends ParentClass{
    String address;
    void living(){
        System.out.println(lastname + address);
    }
}

class Animal {
    String name;
    void speak(){
        System.out.println(name + "speak");
    }
}

class Mammal extends Animal{
    String breed;
    void fur() {
        System.out.println(name+" "+breed);
    }
}

class Reptile extends Animal {
    int eggs;
    void sheds() {
        System.out.println(name+ " has " +eggs);
    }
}

class Amphibian extends Reptile {
    String scale;
    void swims() {
        System.out.println(name+" has "+eggs+" and "+scale);
    }
}


class DogClass extends Mammal{
    String country;
    void bark() {
        System.out.println("Dog of "+country+" barks");
    }
}

class Cat extends Mammal{
    String origin;
    void meow() {
        System.out.println(name+" "+breed+" "+origin);
    }
}

class Labrador extends DogClass {
    String color;
    void play() {
        System.out.println(name+" "+breed+" "+country+" "+color);
    }
}

class GermanShepherd extends DogClass {
    String spot;
    void play() {
        System.out.println(name+" "+breed+" "+country+" "+spot);
    }
}