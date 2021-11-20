import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exchange {
    String sent, rev;
    int size;

    Exchange() {
        sent = "";
        rev = "";
        size = 0;
    }

    void readsentence() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sent = br.readLine();
        size = sent.length();
    }

    void exfirstlast() {
        String[] ar = sent.split(" ");
        for (String ele : ar) {
            char ch = ele.charAt(0);
            ele = ele.replace(ele.charAt(0), ele.charAt(ele.length()-1));
            ele = ele.replace(ele.charAt(ele.length()-1), ch);
            rev += ele.concat(" ");
        }
    }

    void display() {
        System.out.printf("Original sentence : %s\n", sent);
        System.out.printf("New sentence : %s\n", rev);
    }

    public static void main(String[] args) throws IOException {
        Exchange ob = new Exchange();
        ob.readsentence();
        ob.exfirstlast();
        ob.display();
    }
}
