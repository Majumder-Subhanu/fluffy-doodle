import java.io.*;
import java.util.Scanner;

public class FileReadWriteAssignment {
    public static void main(String[] args) {
        try {
            String url = "subhanu.txt";
            File file = new File(url);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                String s = sc.nextLine();
                pw.println(s);
            }
            pw.close();
            fw.close();
            bw.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String accept = "";
        try {
            System.out.printf("");
            FileReader fr = new FileReader("subhanu.txt");
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while ((accept = br.readLine()) != null) {
                if (i == 2) break;
                else i++;
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] ar = accept.split(" ");
        System.out.println(ar[3]);
    }
}
