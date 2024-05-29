package Week7;
/*make attributes: name, brand, year, color
 * make a function modiify() that takes new color and set to old color
 * make a function expiry() that returns 100 added to year
 * make a function start() that prints(name is starting)
 * make a function stop() that prints(name is stoping)
 * make a function detail() that print(name, brand, color and year)
 * make 3 Object of Car
 * Start all 3 object
 * Stop only 1st objest
 * Modify 2nd car to Green color
 * Print the expiry of 3rd Object
 * Print detail of all 3 object
 */
public class TaskMay29thpt2 {
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.name = "Ram";
            p1.age = 12;
            p1.gender = 'M';
            System.out.println(p1.name);
            p1.introduction();
    
            Person p2 = new Person();
            p2.name = "AC";
            p2.age = 20;
            p2.gender = 'M';
            p2.introduction();
    
            Square s1 = new Square();
            s1.sides = 10;
            int s1Area = s1.area();
            System.out.println(s1Area);
            s1.addSides(2);
            System.out.println(s1.area());
    
            Rectangle r = new Rectangle();
            r.len = 2.3;
            r.bre = 3.7;
            System.out.println(r.areaOfRect());
            System.out.println(r.perimeterOfRect());
    
            Car c1 = new Car();
            Car c2 = new Car();
            Car c3 = new Car();
    
            c1.name = "BMW";
            c1.brand = "AG";
            c1.year = 1917;
            c1.color = "Blue";
    
            c2.name = "Bugatti";
            c2.brand = "Chiron";
            c2.year = 2000;
            c2.color = "Black";
    
            c3.name = "Lambo";
            c3.brand = "Urus";
            c3.year = 2017;
            c3.color = "Yellow";
    
            c1.start();
            c2.start();
            c3.start();
    
            c1.stop();
    
            c2.modify("Green");
        
            System.out.println("Expiry of 3rd: "+c3.expiry());
    
            c1.detail();
            c2.detail();
            c3.detail();
        }
    }
    
    class Car {
        String name;
        String brand;
        int year;
        String color;
    
        void modify(String color){
            this.color = color;
        }
        int expiry(){
            return year+100;
        }
        void start(){
            System.out.println(this.name+" is starting...");
        }
        void stop(){
            System.out.println(this.name+", "+this.brand+" is stopping");
        }
        void detail(){
            System.out.printf("%s, %s, %s and %d", this.name, this.brand, this.color, this.year);
        }
    
    }
    
    class Rectangle {
        double len;
        double bre;
    
        double areaOfRect(){
            return len*bre;
        }
    
        double perimeterOfRect(){
            return 2*(len+bre);
        }
    }
    
    class Square {
        int sides;
        int area(){
            int area = sides * sides;
            return area;
        }
        void addSides(int val){
            sides = sides + val; // sides will retain state/data
        }
    }
    
    class Person {
        //data/fields/attributes/properties
        String name;
        int age;
        char gender;
    
        // procedures/functions/methods
        void introduction() {
            System.out.println("Hi my name is "+name);
        }
    }
    

