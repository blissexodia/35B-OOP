package Week6;
/* Task
* Make the following Array name
* [
*
["Sarjak", "Ayush", "Rabi"],
*["Yudip", "Utsav", "Bibek"],
* ["Rabina", "Kimti", "Sneha"]
* ]
*Print all the names
* Also, Find on which array is Kimti is
* Output:2
*/
public class TaskMay19thpt2 {
     public static void main(String[] args) {
            // Define the array
            String[][] names = {
                {"Sarjak", "Ayush", "Rabi"},
                {"Yudip", "Utsav", "Bibek"},
                {"Rabina", "Kimti", "Sneha"}
            };
            
            // Print all the names
            System.out.println("All Names:");
            for (String[] array : names) {
                for (String name : array) {
                    System.out.println(name);
                }
            }
            
            // Find the index of "Kimti"
            int index = -1;
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names[i].length; j++) {
                    if (names[i][j].equals("Kimti")) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    break;
                }
            }
            
            // Print the index
            System.out.println("Index of 'Kimti': " + (index + 1));
        }
    }
    
