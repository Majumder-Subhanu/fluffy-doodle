import java.util.Scanner;

public class Un_range {
    public static boolean is_un(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a + 1; i < b; i++) {
            if (is_un(Integer.toString(i))) {
                System.out.println(i);
            }
        }
    }
}
