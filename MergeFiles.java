import java.io.*;
import java.util.Scanner;

public class MergeFiles {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "subhanu.txt";
        File file = new File(url);
        String url2 = "subhanu2.txt";
        File file2 = new File(url2);
        Scanner file_read = new Scanner(file);
        StringBuffer content = new StringBuffer();
        while (file_read.hasNextLine()) content.append(file_read.nextLine()).append("\n");
        try {
            FileWriter fw = new FileWriter(file2, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.append(content.toString());
            pw.close();
            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file_read.close();
    }
}
