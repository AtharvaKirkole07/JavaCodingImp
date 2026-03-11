import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.*;

class pot{
    public static void main(String[] args) {
        String str="rouhfiuooooooooooooooy";

        HashMap<Character,Integer> hset=new HashMap<>(); 

        for(int i=str.length()-1;i>=0;i--)
        {
            if(hset.containsKey(str.charAt(i)))
            {
                int count=hset.get(str.charAt(i));

                hset.put(str.charAt(i), ++count);
            }
            else
            {
                hset.put(str.charAt(i), 1);
            }
        }

        System.out.println(hset);
    }
}