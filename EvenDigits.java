import java.util.Scanner;

public class EvenDigits {
    public static boolean is_al_even(int N) {
        boolean flag = true;
        if (N == 0) {
            return true;
        } else {
            while (N != 0) {
                int d = N % 10;
                if (d % 2 != 0) {
                    flag = false;
                    break;
                }
                N /= 10;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 0;
            int plus_counter = 0, minus_counter = 0;

            System.out.printf("Case #%d: %d\n", (i + 1), ans);
        }
    }
}
