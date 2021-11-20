import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class SubhanuSort {
    public static char[] sort_subhanu(char[] arr) {

        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && c <= (arr.length - 3) * arr.length) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                c++;
                i = -1;
            }
        }

        return arr;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("Files/result.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        int test_case = 0;
        while (test_case < 10000) {
            int len = (int) ((Math.random() * 100) + 3);
            char[] ar = new char[len];
            for (int i = 0; i < len; i++) {
                ar[i] = (char) (new Random().nextInt());
            }
            char[] ar_sorted = sort_subhanu(ar);
            pw.println(Arrays.toString(ar));
            Arrays.sort(ar);
            boolean val = Arrays.equals(ar_sorted, ar);
            pw.println(val);
            test_case++;
        }
        pw.flush();
        pw.close();
        bw.close();
        fw.close();
    }
}
