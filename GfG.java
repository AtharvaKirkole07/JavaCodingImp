import java.util.Arrays;

public class GfG {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        
        // QuickSort implementation inside the main method
        int low = 0;
        int high = n - 1;
        
        // QuickSort logic
        if (low < high) {
            // Partitioning index
            int pivot = arr[high];  // Choose last element as pivot
            int i = low - 1;  // Index for smaller elements
            
            // Traverse the array to rearrange elements around the pivot
            for (int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // Swap elements if they are smaller than the pivot
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
            // Swap pivot to its correct position
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            
            int pi = i + 1;  // Partition index
            
            // Recursively apply QuickSort to the subarrays
            if (low < pi - 1) {
                // QuickSort for left subarray
                low = low;
                high = pi - 1;
                // Repeat the above steps for left side
            }
            
            if (pi + 1 < high) {
                // QuickSort for right subarray
                low = pi + 1;
                high = high;
                // Repeat the above steps for right side
            }
        }

        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        // Print sorted array
    }
}