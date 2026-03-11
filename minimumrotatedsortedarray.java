class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example rotated array
        int left = 0;
        int right = nums.length - 1;

        // If the array is not rotated (already sorted), the first element is the minimum
        if (nums[left] < nums[right]) {
            System.out.println("The minimum element is: " + nums[left]);
            return;
        }

        // Binary search to find the minimum element
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is greater than the rightmost element, 
            // the minimum element is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the minimum element is in the left half or at mid
                right = mid;
            }
        }

        // Print the minimum element
        System.out.println("The minimum element is: " + nums[left]);
    }
}
