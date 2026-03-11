class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 5, 1, 0,7,2};
        int n = arr.length;

    if (n == 1)
        System.out.println("Inavalid");
    if (arr[0] >= arr[1])
        System.out.println("Invalid");
    if (arr[n - 1] >= arr[n - 2])
        System.out.println(arr[n-1]);
    
    for (int i = 1; i < n - 1; i++) 
    {
        // Check if the neighbors are smaller
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
            System.out.println(arr[i]);
    }

}
}
