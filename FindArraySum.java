import java.util.*;

public class FindArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        ArrayList<String> solution = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : ar) {
            if (!map.containsKey(sum - i)) {
                map.put(i, (sum - i));
            } else {
                int[] sol = {i, (sum-i)};
                solution.add(Arrays.toString(sol));
            }
        }
        System.out.println(solution.toString());
    }
}
