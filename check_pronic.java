public class check_pronic {
    int check(int n) {
        int flag = 0;
        for (int i = 1; i <= (n / 2) + 1; i++) {
            if (i * (i + 1) == n) {
                flag = 1;
            }
        }
        return flag;
    }

    void display() {
        int[] arr = new int[20];
        for (int i = 1; i <= 20; i++) {
            if (check(i) == 1) {
                arr[i - 1] = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
    }

    public static void main(String[] args) {
        check_pronic ob = new check_pronic();
        ob.display();
    }
}
