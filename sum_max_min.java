import java.util.*;
class sum_max_min{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), sum=0;
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        int max = arr[0], min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){max = arr[i];}
            if(arr[i]<min){min = arr[i];}
        }
        max=sum-min;
        min=sum-max;
        System.out.println(min+" "+max);
    }
}