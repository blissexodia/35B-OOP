package Week6;

/* Make an ArrayList as student as following
* ["Aruna", "Shreeya", "Yudip", "Anjali", "Nishcay", "Krishna"] 
* Make 2 another ArrayList males and females
* Loop the students ArrayList
* add "Yudip", "Nischay" and "Krihsna" in males * add "Aruna", "Shreeya" and "Anjali" in females 
* Print Anjali from females
* Print Yudip from males
*/

import java.util.ArrayList;

public class Task22ndMaypt2{
    public static void main(String[] args) {
        // Make an ArrayList of students
        ArrayList<String> students = new ArrayList<>();
        students.add("Aruna");
        students.add("Shreeya");
        students.add("Yudip");
        students.add("Anjali");
        students.add("Nishcay");
        students.add("Krishna");

        // Make two other ArrayLists for males and females
        ArrayList<String> males = new ArrayList<>();
        ArrayList<String> females = new ArrayList<>();

        // Loop through the students ArrayList
        for (String student : students) {
            // Add "Yudip", "Nischay", and "Krishna" to males
            if (student.equals("Yudip") || student.equals("Nishcay") || student.equals("Krishna")) {
                males.add(student);
            }
            // Add "Aruna", "Shreeya", and "Anjali" to females
            else if (student.equals("Aruna") || student.equals("Shreeya") || student.equals("Anjali")) {
                females.add(student);
            }
        }

        // Print Anjali from females
        System.out.println("Anjali from females: " + females.get(females.indexOf("Anjali")));

        // Print Yudip from males
        System.out.println("Yudip from males: " + males.get(males.indexOf("Yudip")));
    }
}
