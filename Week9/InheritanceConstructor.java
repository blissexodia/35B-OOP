package Week9;

public class InheritanceConstructor {
    public static void main(String[] args) {
        
    }
    
}

class Shirt{
    String color = "Black"; // super.color
    Shirt(){
        System.out.println("Making shirt");
    }
}

class Polo extends Shirt{
    String color = "white"; // this.color
    String texture;
    Polo(){
        // By default the constructor of parent is called
        // meaning super() or Shirt() on first line of execution
        System.out.println("Making Polo shirt");
    }
    void differentColor(String color){
        System.out.println("Param color " + color);
        System.out.println("Class color " + this.color);
        System.out.println("parent color " + super.color);
    }
}