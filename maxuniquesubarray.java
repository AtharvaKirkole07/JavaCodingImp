import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 6, 5, 1};
        int maxSum = 0, currentSum = 0, start = 0;
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int end = 0; end < arr.length; end++) {
            while (uniqueSet.contains(arr[end])) {
                currentSum -= arr[start];
                uniqueSet.remove(arr[start]);
                start++;
            }

            uniqueSet.add(arr[end]);
            currentSum += arr[end];
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Sum of Unique Subarray: " + maxSum);
    }
}
