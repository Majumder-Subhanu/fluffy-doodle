package ISC_Program_Set_II;
import java.util.*;
public class RecursiveSentenceRverse
{  
    void reverse(String str)
    {
        if (str.length() <= 1)
            System.out.print(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        RecursiveSentenceRverse ob = new RecursiveSentenceRverse();
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (String i : words)
        {
            ob.reverse(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
