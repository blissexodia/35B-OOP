package Week6;
/* Task
 * Make ArrayList of the following
 * ["Apple", "Orange", "Banana", "Watermelon", "Pineapple"]
 * Add "Grapes" in 1 index 
 * Remove Watermelon
 * Add pear in the 0th index
 * Change "Pineapple to "Avacado"
 * Change "Apple" to "Cherry"
 * Note: Print on every add and remove to get the new index of ArrayList
 */
import java.util.ArrayList;

public class TaskMay22nd{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Pineapple");

        System.out.println("Initial ArrayList: " + fruits);

        // Add "Grapes" at index 1
        fruits.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + fruits);

        // Remove "Watermelon"
        fruits.remove("Watermelon");
        System.out.println("After removing Watermelon: " + fruits);

        // Add "Pear" at index 0
        fruits.add(0, "Pear");
        System.out.println("After adding Pear at index 0: " + fruits);

        // Change "Pineapple" to "Avocado"
        int index = fruits.indexOf("Pineapple");
        if (index != -1) {
            fruits.set(index, "Avocado");
            System.out.println("After changing Pineapple to Avocado: " + fruits);
        }

        // Change "Apple" to "Cherry"
        index = fruits.indexOf("Apple");
        if (index != -1) {
            fruits.set(index, "Cherry");
            System.out.println("After changing Apple to Cherry: " + fruits);
        }
    }
}