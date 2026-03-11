class powerof {
    public static void main(String[] args) {
        // Test case
        int num1 = 25; 
        int target=5; // You can change this value to test other numbers

        // Checking if num1 is a power of three
        if (num1 > 0) {
            while (num1 % target == 0) {
                num1 /= target;
            }
            if (num1 == 1) {
                System.out.println("The number is a power of three.");
            } else {
                System.out.println("The number is not a power of three.");
            }
        } else {
            System.out.println("The number is not a power of three.");
        }
    }
}
