class bsearch {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int l = 0, r = n - 1;
        int result = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            // Check if x is present at mid
            if (arr[mid] == x) {
                result = mid;
                break;
            }

            // If x greater, ignore left half
            else if (arr[mid] < x) {
                l = mid + 1;
            }

            // If x is smaller, ignore right half
            else {
                r = mid - 1;
            }
        }

        // Print the result
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
