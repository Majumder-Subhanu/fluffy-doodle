import java.util.*;

public class n_fibo {
    public int n_th_fibo(int n){
        if (n <=1) return 1;
        else return n_th_fibo(n-1) + n_th_fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n_fibo ob = new n_fibo();
        int n = sc.nextInt();
        System.out.println(ob.n_th_fibo(n));
        sc.close();
    }
}
