class Easy {
    public static void main(String[] args) {
        int[] arr = { 0, 1, -3, 4, 11, 2, 1, -5, 4 };

        // Apply Kadane's Algorithm to find the maximum subarray sum
        int after = arr[0];
        int before = arr[0];
        int start = 0, end = 0, s = 0;

        for (int i = 1; i < arr.length; i++) {
            // Update maxEndingHere to be either the current element alone or
            // the current element plus the previous maxEndingHere
            if (arr[i] > before + arr[i]) {
                before = arr[i];
                s = i; // Update the tentative start index
            } else {
                before = before + arr[i];
            }

            // Update maxSoFar to be the maximum value between maxSoFar and maxEndingHere
            if (before > after) {
                after = before;
                start = s; // Update the confirmed start index
                end = i;   // Update the end index
            }
        }

        System.out.println("Maximum subarray sum is: " + after);
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);

        // Display the maximum subarray
        System.out.print("Maximum subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
