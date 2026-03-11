import java.util.HashSet;

class DuplicateElement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2,3, 5};

        HashSet<Integer> hset = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!hset.add(arr[i])) {
                System.out.println("Duplicate found: " + arr[i]);
            } 
            
        }
    }
}
