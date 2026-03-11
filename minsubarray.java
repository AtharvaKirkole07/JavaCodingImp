import java.util.*;

class MinSub {
    public static void main(String[] args) {
        int[] arr = { -2,2, 3, 5, 66, 6, 10 };
        int s = 0; // Start of the current minimum subarray
        int start = 0; // Start of the minimum sum subarray
        int end = 0; // End of the minimum sum subarray
        int before = arr[0]; // Minimum sum of subarray ending at the current index
        int after = arr[0]; // Minimum sum found so far

        for (int i = 1; i < arr.length; i++) {
            // Check if starting a new subarray from arr[i] is better
            if (arr[i] < before + arr[i]) {
                before = arr[i];
                s = i; // Reset the start of the current subarray
            } else {
                before += arr[i];
            }

            // Update the global minimum sum and indices if we found a new minimum
            if (before < after) {
                after = before;
                start = s;
                end = i;
            }
        }

        System.out.println("Minimum subarray sum is: " + after);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);

        // Printing the subarray itself
        System.out.print("Subarray with minimum sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
