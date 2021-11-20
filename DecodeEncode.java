import java.util.Scanner;

public class DecodeEncode {

    String encoded_string;
    String decoded_string;

    DecodeEncode() {
        encoded_string = "";
        decoded_string = "";
    }

    void take_input() {
        Scanner sc = new Scanner(System.in);
        encoded_string = sc.nextLine();
    }

    //2312179862310199501872379231018117927

    void convert_string() {
        encoded_string = encoded_string.replace(" ", "");
        StringBuffer str = new StringBuffer(encoded_string).reverse();
        encoded_string = str.toString().replace("32", "  ");
    }

    void decode_string() {
        for (int i = 0; i < encoded_string.length() - 2; i++) {
            String two_char = encoded_string.substring(i, i + 2);
            char n1 = 0;
            if (!two_char.equals("  ")) {
                n1 = (char) Integer.parseInt(two_char);
            } else {
                decoded_string = decoded_string.concat(" ");
            }
            String three_char = encoded_string.substring(i, i + 3);
            char n2 = (char) Integer.parseInt(three_char);
            if (Character.isAlphabetic(n1) && !Character.isDigit(n1)) {
                decoded_string = decoded_string.concat(String.valueOf(n1));
                i += 1;
            } else if (Character.isAlphabetic(n2) && !Character.isDigit(n2)) {
                decoded_string = decoded_string.concat(String.valueOf(n2));
                i += 2;
            }
        }
    }

    public void print_results() {
        System.out.println(decoded_string);
    }

    public static void main(String[] args) {
        DecodeEncode obj = new DecodeEncode();
        obj.take_input();
        obj.convert_string();
        obj.decode_string();
        obj.print_results();
    }

}
