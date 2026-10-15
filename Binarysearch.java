import java.util.*;
  
public class Binarysearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array [] = new int[10];

        System.out.println("Enter Array Values: ");
        for(int i=0;i<10;i++){
            Array[i] = sc.nextInt();
        }
        System.out.print("Enter Key:");
        int n = sc.nextInt();

        binarysearch(Array,n);
        Reverse(Array);
        int a [] = {6,7,0,1,2,3,4,5};
       System.out.println(binarysearchRotated(a, 0)); 

     }

    public static void binarysearch( int Array[] , int n )
     {
        int start = 0,end =9;

        while(start <= end)
        {
            int mid = (start+end)/2;
            if(Array[mid]== n)
            {
                System.out.println("Key Found at :"+mid);
                return;
            }
            else if(Array[mid]>n)
            {
                end = mid-1;
            }
            else
                start = mid+1;

        }
        System.out.println("Key Not Found");
        

     }
      public static void Reverse(int Array[])
       {
        int temp;
        int n = Array.length;

        for(int i=0;i<=n/2;i++)
        {
            temp = Array[i];
            Array[i] = Array[n -1 -i];
            Array[n -1 -i] = temp;

        }
        System.out.println("Reverse of Array: ");
        for(int i = 0;i<10;i++)
        {
            System.out.println(Array[i]);
        }
      }

    public static int binarysearchRotated(int a[],int target)
    {   
      int st = 0;
      int end = a.length -1;
      int mid;
    while(st<=end)
    {
        mid  = (st + end)/2;
    if(a[mid] == target)
   {
    return mid;
   }
  
   //left part
   if(a[st]<=a[mid])
   {
    //does target exist
    if(target>=a[st] && target<= a[mid])
    {
        end = mid-1;
    }
    else{//target is not in leftpart
        st = mid + 1;
    }

   }
   else
   {
    if(target>=a[mid] && target<=a[end])
    {
      st = mid+1;
    }
    else{
        end = mid - 1;
    }
   }
    }
    return -1;
}
}