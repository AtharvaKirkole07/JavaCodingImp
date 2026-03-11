import java.util.*;

class Mainthree{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 5};
        int targetSum = 10;
        int n = arr.length;

        // Iterate through the array with the first element
        for (int i = 0; i < n - 2; i++) {
            int currentTarget = targetSum - arr[i];

            // Create a HashSet to store the elements
            HashSet<Integer> set = new HashSet<>();

            // Iterate through the array with the second element
            for (int j = i + 1; j < n; j++) {
                int complement = currentTarget - arr[j];

                // Check if the complement exists in the set
                if (set.contains(complement)) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + complement);
                    break;
                }

                // Add the current element to the set
                set.add(arr[j]);
            }
        }
    }
}
