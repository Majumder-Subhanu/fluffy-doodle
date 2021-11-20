import java.util.Scanner;

public class N_fibo
{
    public int n_fibo(int n) {
        if (n <= 2) { 
            return n-1;
        } else {
            return n_fibo(n-1) + n_fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N_fibo ob = new N_fibo();
        int n = sc.nextInt();
        System.out.println(ob.n_fibo(n));
        sc.close();
    }
}
