import java.util.Scanner;

public class RecursiveBinaryAddition {
    long decimal;

    public RecursiveBinaryAddition(long decimal) {
        this.decimal = decimal;
    }

    public long Decimal_to_Binary(long decimal) {
        if (decimal == 0)
            return decimal;
        else {
            return decimal % 2 + 10 * (Decimal_to_Binary(decimal / 2));
        }
    }

    public long BinaryAddition(RecursiveBinaryAddition obj1, RecursiveBinaryAddition obj2) {
        int num1 = Integer.parseInt(String.valueOf(obj1.Decimal_to_Binary(obj1.decimal)), 2);
        int num2 = Integer.parseInt(String.valueOf(obj2.Decimal_to_Binary(obj2.decimal)), 2);
        decimal = Decimal_to_Binary(num1 + num2);
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        RecursiveBinaryAddition obj1 = new RecursiveBinaryAddition(x);
        RecursiveBinaryAddition obj2 = new RecursiveBinaryAddition(y);
        RecursiveBinaryAddition obj3 = new RecursiveBinaryAddition(0);
        long binary_sum = obj3.BinaryAddition(obj1, obj2);
        System.out.printf("%d - %d\n", x, obj1.Decimal_to_Binary(x));
        System.out.printf("%d - %d\n", y, obj1.Decimal_to_Binary(y));
        System.out.printf("Sum of: %d + %d\n", obj1.Decimal_to_Binary(x), obj2.Decimal_to_Binary(y));
        System.out.printf("Result: %d\n", binary_sum);
    }
}
