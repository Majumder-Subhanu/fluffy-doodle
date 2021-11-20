import java.util.Scanner;

public class Fermat_Little_theorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            if (Math.pow(2, n-1)%n == 1 || n == 2) System.out.println("Prime");
            else System.out.println("Not Prime");
        }
    }
}