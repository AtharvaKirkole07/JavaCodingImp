import java.util.*;

class two{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum=9;

        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            int diff=sum-arr[i];

            if(hs.contains(diff))
            {
                System.out.println("Pair found"+arr[i]+""+diff);
            }
            hs.add(arr[i]);
        }
        
    }
}