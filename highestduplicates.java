import java.util.*;
public class highestduplicates {
    public static void duplicates(int a[])
    {
        int count [] = new int[a.length];
        int c =  0;

        for(int i=0;i<a.length;i++)
        {     c=1;
            for(int j=i+1; j<a.length;j++)
            { 
                if(a[i]==a[j])
                {
                    c++;
                }
                
            }
            count[i]=c;

        }
        int maxcount = count[0];
        int element= a[0];
        for(int i=1;i<a.length;i++)
        {
            if(maxcount<count[i])
            {
                maxcount = count[i];
                element = a[i];
            }
        }
        System.out.println("Element "+element+" Occurs for "+maxcount+" times");
        
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,2,2,1};
        duplicates(a);
        
    }
}
