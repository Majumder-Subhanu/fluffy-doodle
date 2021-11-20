import java.io.*;
import java.util.Scanner;

public class File_Reader {
    public static void main(String[] args) {
        File file = new File("Subhanu.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
