class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World Java Programming";
        StringBuilder result = new StringBuilder();
        int start = 0;

        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ') {
                // Reverse the word between start and i - 1
                for (int j = i - 1; j >= start; j--) {
                    result.append(input.charAt(j));
                }
                // Add a space after the word, except at the end
                if (i < input.length()) {
                    result.append(" ");
                }
                // Move start to the next word
                start = i + 1;
            }
        }

        System.out.println("Reversed words: " + result.toString());
    }
}
