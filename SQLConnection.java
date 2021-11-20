import java.sql.*;
import java.util.Scanner;

public class SQLConnection {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection mydb = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/users", "root", "");
            Statement cursor = mydb.createStatement();
            String fn, ln;
            fn = sc.next();
            ln = sc.next();
            String q = "insert into users (fname, lname) values ('"+fn+"', '"+ln+"')";
            System.out.println(q);
            cursor.executeUpdate(q);
        } catch (Exception e) {
            System.out.println("Error...");
        }
        sc.close();
    }
}
