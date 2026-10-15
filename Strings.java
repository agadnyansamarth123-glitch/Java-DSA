import java.util.*;
public class Strings
{
    public static void main(String[] args) {
        String str = "a";
        int sum =0;
        for(char ch = 'a'; ch <='z' ;ch++)
        { 
            str=str+ch;
            sum=sum+1;

        }
        System.out.println(sum);
        System.out.println(str);
    }

}