import java.util.Scanner;

public class sum_up_to_n {
    public static int sum_digits(int m) {
        int S = 0;
        while (m != 0) {
            int d = m % 10;
            S += d;
            m /= 10;
        }
        return S;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, i;
        n = sc.nextInt();
        m = sc.nextInt();
        for (i = m + 1; true; i++) {
            if (sum_digits(i) == n){
                break;
            }
        }
        System.out.println(i);
    }
}
/*
 * Thu morning 6:30
 * Sat morning 8:30
 * */