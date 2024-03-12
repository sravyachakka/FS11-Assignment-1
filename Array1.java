
import java.util.Arrays;

public class SortingArray {
    
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 3, 2, 8, 2, 4, 9, 2}; 
        int num = 2; 
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        int occurrences = countOccurrences(array, num);
        System.out.println("Occurrences of " + num + ": " + occurrences);
    }
    
    
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }
}