import java.util.*;
public class Stack_func {


    public static String reverse_String(String str)
    {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
         while(!s.isEmpty())
         {  char c = s.pop();
            sb.append(c);
         }


         return sb.toString();
        
    }
    public static void main(String[] args) {
       
        String name = "Samarth";
        System.out.println(name);
        System.out.println(reverse_String(name));

    }
}
