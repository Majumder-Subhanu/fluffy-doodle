import java.util.Arrays;
import java.util.Scanner;

public class Mural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            int[] ar2 = new int[n];
            for (int i = 0; i < ar.length; i++) {
                ar2[i] = ((int) ar[i]) - 48;
            }
            int pos = s.indexOf(ar[n - 1]);
            System.out.println();
        }
    }
}