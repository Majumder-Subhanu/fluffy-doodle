import java.io.*;
import java.util.Scanner;

public class FileReplaceAssignment {
    public static int find_length(String s) {
        String[] ar = s.split(" ");
        return ar.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int N = sc.nextInt();
        String url = "subhanu.txt";
        File file = new File(url);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i <= N; i++) {
                String s = sc.nextLine();
                pw.println(s);
            }
            pw.close();
            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
        try {
            String accept = "";
            FileReader fr = new FileReader("subhanu.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((accept = br.readLine()) != null) {
                System.out.printf("%s\t\t\t\t%d\n", accept, find_length(accept));
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String accept = "";
            FileReader fr = new FileReader("subhanu.txt");
            BufferedReader br = new BufferedReader(fr);
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter the line number to replace word : ");
            int ln = sc.nextInt();
            System.out.print("Enter the word to replace : ");
            String wd = sc.next();
            System.out.print("Enter the new word : ");
            String nwd = sc.next();
            int i = 0;
            while ((accept = br.readLine()) != null) {
                if (i == ln-1) {
                    accept = accept.replace(wd, nwd);
                    System.out.println(accept);
                }
                i++;
            }
            br.close();
            fr.close();
            sc2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
