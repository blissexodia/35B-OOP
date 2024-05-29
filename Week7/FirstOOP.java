package Week7;
public class FirstOOP {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ram";
        p1.age = 12;
        p1.gender = 'M';
        System.out.println(p1.name);
        
        Person p2 = new Person();
        p2.name = "Big daddy binnol 🙏";
        p2.age = 19;
        p2.gender = 'M';
        p2.introduction();
    }
}

class Person{
    //data/fields/attributes/properties
    String name;
    int age;
    char gender;

    // procedures/function/methods
    void introduction(){
        System.out.println("Hi my name is "+ name);
    }
}

