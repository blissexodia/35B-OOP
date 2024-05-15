package Week6;
/* Make the function for the above name arrayFinder
 
Takes array of String and String as parameter
return index if 2nd argument value matches any element of array
else return -1
print the return index value
*/
public class Task15thMaypt3{
        public static void main(String[] args) {
            String[] array = {"John", "Doe", "Foo", "Bar"};
            String searchItem = "Foo";
            int resultIndex = arrayFinder(array, searchItem);
            System.out.println("Index of " + searchItem + " is: " + resultIndex);
        }
    
        public static int arrayFinder(String[] array, String searchItem) {
            int index = 0;
            boolean found = false;
     
    
}
}
