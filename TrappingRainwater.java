import java.util.*;

public class TrappingRainwater {
    public static void trappedWater(int height[])
    {
        int n= height.length;

        // left max Boundry
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

            int rightmax[]=new int[n];
            rightmax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--)
        {
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        int waterlvl ;
        int trapwater=0;
        for(int i =0;i<n;i++)
        {
        waterlvl = Math.min(leftmax[i],rightmax[i]);
        trapwater =  trapwater + (waterlvl- height[i]);
        }
       System.out.println("Trapped water is:"+trapwater);
}

public static void main(String[] args) {
    int height[] ={4,2,0,6,3,2,5};
    trappedWater(height);
}
}