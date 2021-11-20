import java.util.Scanner;

public class DateAfter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] days_months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("dd : ");
        int day = sc.nextInt();
        System.out.print("mm : ");
        int month = sc.nextInt();
        System.out.print("yyyy : ");
        int year = sc.nextInt();
        System.out.print("days : ");
        int days_after = sc.nextInt();

        days_months[1] = (year % 4 == 0) || (year % 400 == 0) ? 29 : 28;
        int new_day = (day + days_after) <= days_months[month - 1] ? (day + days_after) : Math.abs(days_months[month - 1] - (day + days_after));
        int new_year = month == 12 && (day + days_after) > 31 ? (year + 1) : year;
        month = new_day < day ? month + 1 : month;
        month = month <= 12 ? month : (month - 12);

        System.out.printf("Future Date : %d / %d / %d", new_day, month, new_year);
    }

}
