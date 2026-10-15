import java.util.*;
public class BacktrackingSubset {
    public static void Subsets(String str ,int i, String newStr) 
    {    
        if(i == str.length())
        {
            System.err.println(newStr);
            return ;
        }
        char curr = str.charAt(i);
        Subsets(str, i+1, newStr+curr); //yes
        Subsets(str, i+1, newStr); //no

    }
    public static void main(String[] args) {
        String str = "abc";
        Subsets(str, 0, new String(""));
    }
}
