import java.util.*;
class clouds{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int [n];
        int[] ar2 = new int [n];
        int c = 0;
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
            if(ar[i] == 1)
                ar2[i] = 0;
            else
                ar2[i] = i;
        }
        for(int i=0; i<n-1; i++){
            if(ar2[i] + 2 == ar2[i+2] || ar2[i] + 1 == ar2[i+1])
                c++;
        }
        System.out.println(c);
    }
}