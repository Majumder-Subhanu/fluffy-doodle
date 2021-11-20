import java.util.Scanner;

public class PrimeTriplets {

    public static boolean is_prime(int n) {

        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) c++;
        }
        return c == 2;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.print("S = ");
        int s = sc.nextInt();
        System.out.print("L = ");
        int l = sc.nextInt();
        System.out.println("The prime triplets are : ");
        for (int i = s; i <= l; i++) {

            if (is_prime(i) && is_prime(i + 2) && is_prime(i + 6)) {

                System.out.printf("%d  %d  %d\n", i, i + 2, i + 6);
                c++;

            } else if (is_prime(i) && is_prime(i + 4) && is_prime(i + 6)) {

                System.out.printf("%d  %d  %d\n", i, i + 4, i + 6);
                c++;

            }

        }
        System.out.printf("Total prime triplet combination are :: %d", c);

    }

}
