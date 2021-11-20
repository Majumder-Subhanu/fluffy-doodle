import java.io.*;

public class File_Writer {
    public File_Writer(File file) {
    }

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("Subhanu.txt");
            java.io.FileWriter fw = new java.io.FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < 10; i++) {
                pw.println(i);
            }
            pw.close();
            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
