import java.util.Arrays;

class RotateSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Sorted array
        int k = 3; // Number of positions to rotate

        // Normalize k if it is larger than the array length
        k = k % arr.length;

        // Reverse the whole array
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Reverse the first k elements
        start = 0;
        end = k - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Reverse the remaining elements
        start = k;
        end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Output the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
