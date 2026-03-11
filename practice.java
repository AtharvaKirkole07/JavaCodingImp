import java.util.*;

class prc{
    public static void main(String[] args) {
        String str="sugsyugsygs";
        int i=0;
        int j=0;

        int start=0;
        int max=0;

        HashSet<Character> hset=new HashSet<>();

        for(i=0;i<str.length();i++)
        {
            if(!hset.contains(str.charAt(i)))
            {
                hset.add(str.charAt(i));
                if(i-j+1>max)
                {
                    max=i-j+1;
                    start=j;
                }
            }
            else
            {
                while (hset.contains(str.charAt(i))) {
                    hset.remove(str.charAt(i));
                    j++;
                }
                hset.add(str.charAt(i));
            }
        }

        String longe=str.substring(start, start+max);
        System.out.println(longe);
    }
}