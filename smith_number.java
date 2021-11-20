import java.util.Scanner;

public class smith_number {
    public static boolean prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                c++;
        if (c == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = n;
        String ns = "";
        int S = 0;
        for (int i = 0; i < ns.length(); i++) {
            S += Integer.valueOf(ns.charAt(i));
        }
        if (S == c)
            System.out.println(c + " is a Smith number");
        else
            System.out.println(c + " is not a Smith number");
    }
}
