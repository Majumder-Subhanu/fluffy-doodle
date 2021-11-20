import java.util.Scanner;
import java.io.*;

public class TabularFormatting 
{
    public static void main(int roll, String name, float marks) throws IOException
    {
        String dir = "/home/subhanu/Desktop/name_list.txt";
        File file = new File(dir);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(fw);
        pw.format("%3d%20s%2f\n", roll, name, marks);
        pw.flush();
        pw.close();
        bw.close();
        fw.close();
    }
}