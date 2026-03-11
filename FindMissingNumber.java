class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2,4, 5, 6}; // Example array with a missing number
        
        // Determine the number of elements in the array
        int n = nums.length;
        
        // Calculate the expected sum of numbers from 1 to n+1
        int expectedSum = (n + 1) * (n + 2) / 2;
        
        // Calculate the actual sum of the elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected and actual sums
        int missingNumber = expectedSum - actualSum;
        
        // Print the missing number
        System.out.println("The missing number is: " + missingNumber);
    }
}
