import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 0;
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            if (s.contains("1 1")){
                c++;
            }
        }
        System.out.println(c);
    }
}
