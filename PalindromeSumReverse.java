import java.util.Scanner;

public class PalindromeSumReverse {

    public static long reverse(long n) {

        long rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long copy = num;
        long sum = num + reverse(num);
        long c = 1;
        while (sum != reverse(sum)) {
            num = sum;
            sum = num + reverse(num);
            c++;
        }
        System.out.printf("num = %d it's palindrome number = %d and found in steps = %d", copy, sum, c);

    }

}
