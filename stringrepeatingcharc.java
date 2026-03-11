import java.util.*;

class repeatstring {
    public static void main(String[] args) 
    {
        String str="ifhifugfufg";
        int min = -1; // Initialize index of first repeating element
        HashSet<Character> set = new HashSet<>(); // Creates an empty hashset

        // Traverse the input array from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            // If element is already in hash set, update min
            if (set.contains(str.charAt(i))) {
                min = i;
            } else { // Else add element to hash set
                set.add(str.charAt(i));
            }
        }

        // Print the result
        if (min != -1) {
            System.out.println("The first repeating element is " + str.charAt(min));
        } else {
            System.out.println("There are no repeating elements");
        }
    }
}
