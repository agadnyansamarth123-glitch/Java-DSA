import java.util.*;
public class BuyandSellStock {
    public static void buysellstock(int a[])
    {
        int maxprofit=0;
        int buyprice = Integer.MAX_VALUE;
        
         for (int i =0 ;i<a.length;i++)
         {                  
            if(buyprice<a[i])
            {
             int profit  = a[i] - buyprice;
               if(maxprofit<profit)
            {
                maxprofit = profit;
            }
            }
            else 
                buyprice=a[i];
        }
        System.out.println("Maximum Profit is :"+maxprofit);
    }
    public static void printAsc(int n) {
        if(n==1)
        {   System.out.print(n);
            return;
        
        }
        printAsc(n-1);
        System.out.print(n+",");
        
    }

    public static void allOccurences(int a[],int idx,int key,String str)
    {
        if(idx==a.length){
            System.out.print(str);
            return;
        }
        if(a[idx]==key)
        {
            str = str + idx +" ";
           
        }
         allOccurences(a, idx +1, key, str);
         
    }
    public static void main(String[] args) 
    {
        int a[] = {7,1,5,5,5,5,8};
        // buysellstock(a);
        // printAsc(5);
        allOccurences(a, 0, 5,  new String (""));
    }

    }


  