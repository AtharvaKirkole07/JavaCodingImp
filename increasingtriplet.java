import java.util.*;

class mn {
    public static void main(String[] args) {
        int[] arr = {8, 2, 8, 9, 1};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                System.out.println("The triplet is " + first + ", " + second + ", " + num);
                return;  // Triplet found, exit the method
            }
        }
        System.out.println("No increasing triplet found");
    }
}