import java.util.*;

class repeat {
    public static void main(String[] args) 
    {
        int[] arr = { 10, 10, 3, 4, 3, 5, 6 };
        int min = -1; // Initialize index of first repeating element
        HashSet<Integer> set = new HashSet<>(); // Creates an empty hashset

        // Traverse the input array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // If element is already in hash set, update min
            if (set.contains(arr[i])) {
                min = i;
            } else { // Else add element to hash set
                set.add(arr[i]);
            }
        }

        // Print the result
        if (min != -1) {
            System.out.println("The first repeating element is " + arr[min]);
        } else {
            System.out.println("There are no repeating elements");
        }
    }
}
