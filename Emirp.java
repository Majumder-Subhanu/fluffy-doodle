import java.io.*;

public class Emirp {
    int n, rev;

    Emirp(int nn) {
        n = nn;
    }

    boolean isprime(int x) {
        if (x == 2 && Math.pow(2, x-1)%x == 1) {
            return true;
        } else {
            return false;
        }
    }

    void isEmirp() {
        int copy = n;
        while (copy != 0) {
            rev = (rev*10)+(copy%10);
            copy /= 10;
        }
        if (isprime(n) && isprime(rev)) {
            System.out.println("Emirp number");
        } else {
            System.out.println("Not emirp number");
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Emirp obj = new Emirp(n);
        obj.isEmirp();
    }
}
