import java.util.Scanner;

public class auto_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check for Automorphic number\n2. Factors of a number\nEnter your choice");
        int ch = sc.nextInt();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        switch (ch) {
            case 1:
                int c = 0;
                int copy = n;
                int sqr = n * n;
                while (n != 0) {
                    int d = n % 10;
                    c++;
                }
                if (copy % Math.pow(10, c) == n) {
                    System.out.println("Automorphic Number");
                } else {
                    System.out.println("Not Automorphic Number");
                }
                break;
            case 2:
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        System.out.println(i);
                    }
                }
                break;
        }
    }
}
