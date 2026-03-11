class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the width and the height
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;

            // Update the maximum area found
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer with the shorter height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("The maximum area is: " + maxArea);
    }
}
