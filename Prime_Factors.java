public class Prime_Factors {
    public static boolean prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                c++;
        if (c == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 91;
        String ns = "";
        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0 && prime(i)) {
                    n = n / i;
                    ns += Integer.toString(i);
                    break;
                }
            }
        }
        System.out.println(ns);
        int S = 0;
        for (int i = 0; i < ns.length(); i++) {

            System.out.println(S);
        }
    }
}
