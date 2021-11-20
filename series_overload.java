import java.util.Scanner;

public class series_overload {
    static double series(int n, int x) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                s -= 1 / Math.pow(x, i);
            } else {
                s += 1 / Math.pow(x, i);
            }
        }
        return s;
    }

    static void series(int n) {
        int s = 6;
        int b = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(s+"  ");
            s += b;
            b += 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int x = sc.nextInt();
        double d = series(n1, x);
        System.out.println(d);
        int n2 = sc.nextInt();
        series(n2);
    }
}
