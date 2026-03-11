class Main {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };


        if(arr.length==0)
        {
            System.out.println("eroor inarray");
            
        }
        // Apply Kadane's Algorithm to find the maximum subarray sum
        int after = arr[0];
        int before= arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Update maxEndingHere to be either the current element alone or
            // the current element plus the previous maxEndingHere
            before = Math.max(arr[i], before + arr[i]);

            // Update maxSoFar to be the maximum value between maxSoFar and maxEndingHere
            after = Math.max(after, before);
        }

        System.out.println("Maximum subarray sum is: " + after);
    }
}
