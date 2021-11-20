import java.util.*;
public class dia_diff{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), left = 0, right = 0;
        int arr[][] = new int [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
            left+=arr[i][i];
        }
        int j = 0;
        for(int i=(n-1); i>=0; i--){
            right+=arr[j][i];
            j++;
        }
        int sum = Math.abs(left - right);
        System.out.println(sum);
    }
}