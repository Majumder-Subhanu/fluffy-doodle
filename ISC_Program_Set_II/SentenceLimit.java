package ISC_Program_Set_II;

import java.util.Scanner;

public class SentenceLimit {
    public int count_freq(String s, String[] ar) {
        int c = 0;
        for (String i : ar) {
            if (i.equals(s)) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SentenceLimit obj = new SentenceLimit();
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') c++;
        }
        if (c > n) System.out.println("Limit exceeded!");
        else {
            str = str.replace("!", "");
            str = str.replace(".", "");
            str = str.replace("?", "");
            String[] ar = str.split(" ");
            System.out.printf("Total words = %d\n", ar.length);
            int[] freq = new int[50];
            String[] words = new String[50];
            int k = 0;
            for (String i : ar) {
                freq[k] = obj.count_freq(i, ar);
                words[k] = i;
                k++;
            }
            int cl = 0;
            for (int i = 0; i < freq.length - 1; i++) {
                if (freq[i] > freq[i + 1] && cl <= (freq.length - 3) * freq.length) {
                    int temp = freq[i];
                    String wd = words[i];
                    freq[i] = freq[i + 1];
                    freq[i + 1] = temp;
                    words[i] = words[i + 1];
                    words[i + 1] = wd;
                    cl++;
                    i = -1;
                }
            }
            String s = "";
            for (int i = 0; i < words.length; i++) {
                try 
                {
                    if (!s.contains(words[i]))
                    {
                        if (words[i] != null) System.out.printf("%s : %d\n", words[i], freq[i]);
                        s += words[i];
                    }
                }
                catch (Exception e)
                {
                    continue;
                }
            }
        }
    }
}
