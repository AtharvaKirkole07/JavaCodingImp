class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss"; // Example string
        int[] charCounts = new int[256]; // Array to count character frequencies (ASCII range)

        // Count the frequency of each character
        for (int i = 0; i < input.length(); i++) {
            charCounts[input.charAt(i)]++;
        }

        // Find and print the first non-repeating character
        char result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (charCounts[input.charAt(i)] == 1) {
                result = input.charAt(i);
                break;
            }
        }

        if (result != 0) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
