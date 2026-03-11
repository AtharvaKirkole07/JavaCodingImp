import java.util.*;

class hf{
    public static void main(String[] args) {
        LinkedHashSet<Integer> h=new LinkedHashSet<>();

        int[] arr={1,2,2,3,4};

        for(int num:arr)
        {
            h.add(num);
        }

        System.out.println(h);

    }
}