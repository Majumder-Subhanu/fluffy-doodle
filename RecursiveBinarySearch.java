public class RecursiveBinarySearch {
    public static int binarySearch(int[] A, int low, int high, int x) {
        int mid = (low + high) / 2;
        if (x == A[mid]) {
            return mid;
        } else if (x < A[mid]) {
            return binarySearch(A, low, mid - 1, x);
        } else {
            return binarySearch(A, mid + 1, high, x);
        }
    }

    public static void main(String[] args) {
        int[] ar = {1, 4, 8, 22, 34};
        int len = ar.length;
        int pos = binarySearch(ar, 0, len, 34);
        System.out.println("Element is present in position " + (pos + 1));

    }
}
