import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class ain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array input from user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] input = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        // Get value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Finding k largest elements
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> arr = new ArrayList<>();

        // Add first k elements to the priority queue
        while (i < k) {
            pq.add(input[i]);
            i++;
        }

        // Process the rest of the array
        while (i < input.length) {
            if (input[i] > pq.peek()) {
                pq.poll(); // Remove the smallest element
                pq.add(input[i]); // Add the current element
            }
            i++;
        }

        // Collect the k largest elements
        while (!pq.isEmpty()) {
            arr.add(pq.poll());
        }

        // Print the result
        System.out.println("The " + k + " largest elements are: " + arr);

        scanner.close();
    }
}
