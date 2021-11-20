package ISC_Program_Set_II;
import java.util.*;
public class PrimeFactorisation
{
    boolean is_prime(int n)
    {
        return Math.pow(2, n-1)%n == 1 || n == 2;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PrimeFactorisation ob = new PrimeFactorisation();
        System.out.print("Enter the number :: ");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++)
        {
            while (num % i == 0 && ob.is_prime(i)) 
            {
                System.out.println(i);
                num /= i;
            }
        }
    }
}
