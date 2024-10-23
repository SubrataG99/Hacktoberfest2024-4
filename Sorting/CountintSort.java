import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] array) {
        // Find the maximum value in the array
        int max = Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
        
        // Create a count array to store the count of each unique value
        int[] count = new int[max + 1];
        
        // Count each element in the input array
        for (int num : array) {
            count[num]++;
        }
        
        // Build the sorted output array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(array));
        
        countingSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
