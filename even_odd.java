public class even_odd {
    public static void is_even_odd(int x) {
        if (x == 1 || x == -1) System.out.println("Odd");
        else if (x == 2 || x == -2) System.out.println("Even");
        else {
            if (x < 0) is_even_odd(x+2);
            else is_even_odd(x-2);
        }
    }
}
