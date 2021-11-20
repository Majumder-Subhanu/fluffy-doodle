import java.util.*;
class trip_comp{
    public static int[] compare(int a[], int b[]){
        int sa=0, sb=0;
        int score[] = new int [2];
        for(int i=0; i<3; i++){
            if(a[i]>b[i]) sa++;
            else if(a[i]<b[i])sb++;
            else continue; 
        }
        score[0] = sa;
        score[1] = sb;
        return score;
    }

    public static void main(){
        Scanner sc=new Scanner (System.in);
        int a[] = new int [3];
        int b[] = new int [3];
        for(int i=0; i<3; i++){ 
            a[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++){ 
            b[i] = sc.nextInt();
        }
        int score[] = compare(a, b);
        for(int i=0; i<2; i++){
            System.out.print(score[i]+" ");
        }
    }
}