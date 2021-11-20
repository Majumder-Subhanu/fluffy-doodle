import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class reverse_sort_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> ar = new ArrayList<>(n);
            int[] ar2 = new int[n];
            for (int j = 0; j < n; j++) {
                ar.add(sc.nextInt());
                ar2[j] = (ar.get(j));
            }
            Arrays.sort(ar2);
            for (int j = 0; j < n; j++) {
                int ele = ar2[0];
                int pos = ar.indexOf(ele);
                int e_0 = ar.get(0);
            }
        }
    }
}
