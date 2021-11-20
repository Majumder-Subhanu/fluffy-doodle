import java.lang.*;
import java.util.Scanner;

class circular_prime {
    static boolean isPrime(int n) {
        boolean ans = Math.pow(2, n-1)%n == 1 ? true : false;
        return  ans;
    }

    static boolean checkCircular(int N) {
        int count = 0, temp = N;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int num = N;
        while (isPrime(num)) {
            int rem = num % 10;
            int div = num / 10;
            num = (int) ((Math.pow(10, count - 1)) * rem) + div;
            if (num == N)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (checkCircular(N)) System.out.println("Yes");
        else System.out.println("No");
    }
}
