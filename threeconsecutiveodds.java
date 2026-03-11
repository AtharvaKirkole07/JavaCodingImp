import java.util.*;

class odds{
    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1)
            {
                System.out.println("Thrree");
                break;
            }
            else
            {
                System.out.println("Thrree is not");
                break;
            }
        }
        
    }
}