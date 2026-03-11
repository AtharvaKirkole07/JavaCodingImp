class MoveNegatives {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        int n = arr.length;
        int[] result = new int[n];
        int j = 0;

        // First add all negative numbers to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[j++] = arr[i];
            }
        }

        // Then add all positive numbers to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[j++] = arr[i];
            }
        }

        // Copy the result array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }

        // Print the modified array
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
