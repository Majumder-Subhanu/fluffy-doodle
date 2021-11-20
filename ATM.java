 

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        if (x % 5 == 0 && x < y){
            y -= (double) x + 0.50;
        }
        System.out.println(y);
    }
}
