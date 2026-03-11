import java.util.*;

class Subs {
    public static void main(String args[]) {
        String s = "skjgsyusust";
        int n = s.length();
        int j = 0;
        int max = 0;
        int start = 0; // To keep track of the start index of the longest substring
        HashSet<Character> ch = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!ch.contains(s.charAt(i))) {
                ch.add(s.charAt(i));
                if (i - j + 1 > max) {
                    max = i - j + 1;
                    start = j; // Update the start index of the longest substring
                }
            } else {
                while (ch.contains(s.charAt(i))) {
                    ch.remove(s.charAt(j));
                    j++;
                }
                ch.add(s.charAt(i));
            }
        }

        // Print the longest substring without repeating characters
        String longestSubstring = s.substring(start, start + max);
        System.out.println("Longest substring length: " + max);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }
}
