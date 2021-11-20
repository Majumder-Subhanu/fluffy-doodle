package ISC_Program_Set_II;

import java.util.*;
class EncodedMsg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter encoded message :: ");
        String s=sc.nextLine();
        s=reverseString(s);
        System.out.println(toAscii(s));
    }

    public static String reverseString(String str){  
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        return rev;  
    }  

    public static String toAscii(String s)
    {
        String t="";
        String f="";
        int a = 'a', A = 'A', z = 'z', Z = 'Z';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                t+=s.charAt(i);
                if(t.length()==2||t.length()==3)
                {
                    int t1 = Integer.parseInt(t);
                    if(t1>=A&&t1<=Z)
                    {
                        f+=(char)t1;
                        t="";
                    }
                    else if(t1>=a && t1<=z)
                    {
                        f+=(char)t1;
                        t="";
                    }
                    else
                    {
                        f+=(char)t1;
                        t="";
                    }
                }
            }
        }
        return f;
    }
}