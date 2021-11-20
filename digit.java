public class digit {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 100000000; i < 1000000000; i++) {
            if (c<10 && i % 9 == 0 && (i / 10) % 8 == 0 && (i / 100) % 7 == 0 && (i / 1000) % 6 == 0 && (i / 10000) % 5 == 0 && (i / 100000) % 4 == 0 && (i / 1000000) % 3 == 0 && i % 2 == 0){
                System.out.println(i);
                c++;
            }
        }
    }
}