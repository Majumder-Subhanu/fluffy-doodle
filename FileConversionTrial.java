import java.io.File;

public class FileConversionTrial {
    public static void main(String[] args) {
        String url = "subhanu.txt";
        String url2 = "subhanu1.pdf";
        File file = new File(url);
        File file1 = new File(url2);
        file.renameTo(file1);
    }
}
