import java.util.*;
public class Sales_by_match{
    public static int match_by_sales(int n, int[] ar){
        //4 5 5 5 6 6 4 1 4 4 3 6 6 3 6 1 4 5 5 5
        //1 1 3 3 4 4 4 4 4 5 5 5 5 5 5 6 6 6 6 6 
        //match = 1, 2, 3, 3,
        int match = 0;
        Arrays.sort(ar);
        for(int i = 0; i < n-1; i += 2){
            if (ar[i] == ar[i+1]){
                match += 1;
            }else{
                i -= 1;
            }
        }
        return match;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        System.out.println(match_by_sales(n, ar));
    }
}