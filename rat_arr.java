import java.util.*;
public class rat_arr{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); double pos=0.0, neg=0.0, zero=0.0;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>0){pos++;}
            if(arr[i]<0){neg++;}
            if(arr[i]==0){zero++;}
        }
        System.out.println(pos/n+"\n"+neg/n+"\n"+zero/n);
    }
}
