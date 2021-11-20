import java.util.Scanner;

public class Date_Verification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter date in dd-mm-yyyy format");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            if (month < 12) {
                if (year % 4 == 0 || year % 400 == 0) {
                    if (day <= 31 || (month == 2 && day <= 29)) {
                        System.out.println("Yes the date is valid");
                    } else {
                        System.out.println("No the date is valid");
                    }
                }
            }
        }
    }
}
