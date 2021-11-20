public class magic {
    int magicfun(int n) {
        if (n == 0)
            return 0;
        else
            return magicfun(n / 2) * 10 + (n % 2);
    }
    public static void main(String[] args) {
        magic mag = new magic();
        mag.magicfun(7);
    }
}
