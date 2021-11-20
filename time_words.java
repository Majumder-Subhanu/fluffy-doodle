import java.util.Scanner;

public class time_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        int min = sc.nextInt();
        String[] ar = {"minutes passed", "half past", "o'clock", "Quarter passed", "Quarter to"};
        if (min < 30)
            System.out.println(min + ar[1] + hr);
        else if (min == 30)
            System.out.println(ar[2] + hr);
        else if (min == 45)
            System.out.println(ar[4] + (hr + 1));
        else if (min == 15)
            System.out.println(ar[3] + hr);
        else
            System.out.println(hr + ar[2]);
    }
}
