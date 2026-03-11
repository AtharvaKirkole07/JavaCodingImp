class MajorityElement {
    public static void main(String[] args) {
        int[] a = { 1, 3, 3, 1, 3 ,1,1};
        int size = a.length;

        int max = 0, count = 1;

        // Finding the candidate for Majority
        for (int i = 1; i < size; i++) {
            if (a[max] == a[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                max = i;
                count = 1;
            }
        }

        int candidate = a[max];

        // Checking if the candidate is the majority element
        count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == candidate) {
                count++;
            }
        }

        if (count > size / 2) {
            System.out.println(" " + candidate + " ");
        } else {
            System.out.println("No Majority Element");
        }
    }
}

