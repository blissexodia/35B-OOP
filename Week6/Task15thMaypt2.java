package Week6;
/* Loop the arr using while loop /

/ Make an array of ["John", "Doe", "Foo", "Bar"]
 
Make a String "Foo"
Loop the array and find in which index is "Foo" on
Print the index
*/
public class Task15thMaypt2 {
    public static void main(String[] args) {
        // Make an array
        String[] array = {"John", "Doe", "Foo", "Bar"};

        // Make a String to search for
        String searchItem = "Foo";

        // Initialize index and found flag
        int index = 0;
        boolean found = false;

        // Loop through the array using a while loop
        while (index < array.length && !found) {
            if (array[index].equals(searchItem)) {
                found = true;
            } else {
                index++;
            }
        }

        // Print the index if found
        if (found) {
            System.out.println("Index of " + searchItem + " is: " + index);
        } else {
            System.out.println(searchItem + " not found in the array.");
        }
    }
}

    
