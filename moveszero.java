import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 3};
        int lastNonZeroIndex = 0; // Pointer to track the position of the last non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the elements if they are different
                if (i != lastNonZeroIndex) {
                    int temp = nums[i];
                    nums[i] = nums[lastNonZeroIndex];
                    nums[lastNonZeroIndex] = temp;
                }
                lastNonZeroIndex++;
            }
        }

        // Print the array after moving zeros
        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
    }
}