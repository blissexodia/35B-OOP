package Week7;
public class ConstructorClass{
    public static void main(String[] args){
        ConstructorExample ce = new ConstructorExample();
        System.out.println("After object");
        ParamConstructor pc = new ParamConstructor(10, 20);
        System.out.println(pc.data2);
        // Task 2 Cntd.
        Cat cat1 = new Cat("Nya", 3);
        cat1.breed = "hw";
        cat1.color = "Orange";
        cat1.setAge(cat1.getAge() + 1);
        System.out.println("Name :" + cat1.getName());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Breed: " + cat1.breed);
        System.out.println("Color " + cat1.color);
    }
}