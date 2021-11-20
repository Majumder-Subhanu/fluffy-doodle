import java.util.Scanner;

public class FindDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count_datatype(s);
        sc.close();
    }

    private static void count_datatype(String s) {
        int integer = 0, decimal = 0, string = 0;
        String[] ar = s.split(" ");
        int a = 'a', z = 'z', A = 'A', Z = 'Z';
        for (String i : ar) {
            int ch = i.charAt(0);
            if (ch >=a && ch <= z || ch >= A && ch <= Z) string++;
            else if (!i.contains(".")) integer++;
            else if (i.contains(".")) decimal++;
        }
        System.out.printf("Integer %d\nDouble %d\nString %d", integer, decimal, string);
    }
}
