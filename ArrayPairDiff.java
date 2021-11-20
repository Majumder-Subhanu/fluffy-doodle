import java.util.*;

public class ArrayPairDiff
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        // int len = sc.nextInt();
        int[] ar = {5, 3, 21, 10, 12, 7};// new int[len];  [5 3 21 10 12 7]   [19 0 -5 4 7 10]
        int[] ar2 = new int[ar.length];
        for (int i = 0; i < ar.length; i++)
        {
            // ar[i] = sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = i + 1; j < ar.length; j++)
            {
                int diff = Math.abs(ar[i] - ar[j]);
                System.out.println("[" + ar[i] + "  " + ar[j] + "] =  " + diff);
            }
        }
        // System.out.println(Arrays.toString(ar2));
    }
}
