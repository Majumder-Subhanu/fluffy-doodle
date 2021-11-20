package ISC_Program_Set_II;
import java.util.*;

public class RecursiveFibonacci
{
    public int get_fibo(int n)
    {
        if (n <= 2) 
        {
            return n-1;
        }
        else
        {
            return get_fibo(n - 1) + get_fibo(n - 2);
        }
    }

    public void print_fibonacci(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.print(get_fibo(i) + "  ");
        }
    }
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms :: ");
        int n = sc.nextInt();
        RecursiveFibonacci ob = new RecursiveFibonacci();
        ob.print_fibonacci(n);
    }
}
