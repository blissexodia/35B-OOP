package Week6;
/* Make the function for the above name arrayFinder
 
Takes array of String and String as parameter
return index if 2nd argument value matches any element of array
else return -1
print the return index value
*/
public class Task15thMaypt3{

    public static int arrayFinder(String[] arr, String value) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the value, return its index
            if (arr[i].equals(value)) {
                return i;
            }
        }
        // If no match is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        String searchName = "Charlie";
        int result = arrayFinder(names, searchName);
        System.out.println("Index of " + searchName + ": " + result);
    }
}
