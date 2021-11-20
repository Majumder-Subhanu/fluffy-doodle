import java.util.Scanner;

public class Foregone_2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int d1 = 1;
            /**if (n % 2 == 0) {
             d1 = (n + 1) / 2;
             } else {
             d1 = n / 2;
             }*/
            int d2 = n - d1;
            while (d1 != 0 && d2 != 0) {
                if (!Integer.toString(d2).contains("4")) {
                    System.out.println(d1 + " " + d2);
                    break;
                } else {
                    d1++;
                    d2--;
                }
            }
        }
    }
}
