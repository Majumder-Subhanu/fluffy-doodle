import java.util.*;
public class arr_2d_boundary{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int [r][c], sum=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
                if(i == 0 || i == (r-1)){
                    sum+=arr[i][j];
                }
                if(i>0 && i<(r-1)){
                    if(j == 0 || j==(c-1)){
                        sum+=arr[i][j];
                    }
                }
            }
        }
        System.out.println("The sum of the boundary elements is "+sum);
    }
}