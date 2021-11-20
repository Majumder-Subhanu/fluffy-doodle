import java.util.*;

public class InsersionSort {
    public static void sort_subhanu(int[] arr) {
        int c = 0;
        int count = 2;
        System.out.println("Subhanu Sort\nStep 1 : "+Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && c <= (arr.length - 3) * arr.length) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
                System.out.println("Step "+count+" : "+Arrays.toString(arr));
                c++;
                i = -1;
            }
        }
    }

    public static void insersion_sort(int[] arr){
        System.out.println("\n\nInsersion Sort");
        int i, j, c = 2;
        System.out.println("Step 1 : "+Arrays.toString(arr));
        for (i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i-1; j >= 0; j--) {
                if(arr[j] > temp) {
                    arr[j+1] = arr[j];
                    System.out.println("Step "+c+" : "+Arrays.toString(arr));
                    c++;
                } else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
        System.out.println("Step "+c+" : "+Arrays.toString(arr));
    }
}
