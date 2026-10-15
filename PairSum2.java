import java.util.*;
public class PairSum2 {

    public static boolean pairsum2(ArrayList<Integer> arr,int target)
    {
        int lp =0;
        int rp =arr.size()-1;
        int mid =(lp+rp)/2;
        
        if(arr.get(lp)<=arr.get(mid))
        {
            rp=mid-1;
            while(lp<rp)
        {   
            if(arr.get(lp)+arr.get(rp)== target)
        {
            return true;
        }
            if(arr.get(lp)+arr.get(rp)<target)
            {
                lp++;
            }
            else{
                rp--;
            }
        }
           
        }
        else
        {
           lp=mid+1;
            while(lp<rp)
        {
            if(arr.get(lp)+arr.get(rp)== target)
        {
            return true;
        }
            if(arr.get(lp)+arr.get(rp)<target)
            {
                lp++;
            }
            else{
                rp--;
            } 
        }
    }
    public static void main(String[] args) {
        
    }
    
}
