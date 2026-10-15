import java.util.*;

public class Subarray{

    public static void sub1(int a[])
    {
        int maxsum = Integer.MIN_VALUE;
        int sum =0;
         for(int i=0;i<a.length;i++)
        {
            int st=i;
            for(int j=i;j<a.length;j++)
            {   sum=0;
                int end=j;
                for(int k=st;k<=end;k++)
                {
                    System.out.print(a[k]+" ");
                    sum=sum+a[k];
                    
                }
                if(maxsum<sum){
                    maxsum=sum;
                }
                System.out.println();

            }
            System.out.println();
            
        }
        System.out.println("maxsum="+maxsum);
    }

    public static void prefixsum(int a[])
    {
        int maxsum= Integer.MIN_VALUE;
        int sum =0;
        int prefix[] = new int[a.length];
        prefix[0]=a[0];

         for (int i=1;i<a.length;i++)
         {
            prefix[i] = prefix[i-1]+a[i];
         }
         for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++)
            {
                sum = i==0? prefix[j] :prefix[j]-prefix[i-1];
                if(maxsum<sum){
                    maxsum=sum;
            }
         }
        

    } System.out.println("maxsum="+maxsum);
    }

    
    public static void main(String[] args) {
        int a []={1,2,3,4};
        sub1(a);
        prefixsum(a);
    }


}