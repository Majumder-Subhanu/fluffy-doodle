import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComplexNumberAddition {
    float x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the real part :: ");
        float x1 = Integer.parseInt(in.readLine());
        System.out.print("Enter the imaginary part :: ");
        float y1 = Integer.parseInt(in.readLine());
        ComplexNumberAddition ob1 = new ComplexNumberAddition();
        ob1.input(x1, y1);
        System.out.print("Enter the real part :: ");
        float x2 = Integer.parseInt(in.readLine());
        System.out.print("Enter the imaginary part :: ");
        float y2 = Integer.parseInt(in.readLine());
        ComplexNumberAddition ob2 = new ComplexNumberAddition();
        ob2.input(x2, y2);
        ComplexNumberAddition ob3 = new ComplexNumberAddition();
        ob3 = ob3.add(ob1, ob2);
        ob3.show(ob3);
    }

    private void show(ComplexNumberAddition ob3) {
        System.out.printf("The answer is :: %f + %f i", ob3.x, ob3.y);
    }

    private ComplexNumberAddition add(ComplexNumberAddition ob1, ComplexNumberAddition ob2) {
//        ComplexNumberAddition ob4 = new ComplexNumberAddition();
        this.x = ob1.x + ob2.x;
        this.y = ob1.y + ob2.y;
        return this;
    }

    private void input(float x1, float y1) {
        x = x1;
        y = y1;
    }

}
