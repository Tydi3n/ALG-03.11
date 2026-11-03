public class quicksort {
    public static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
            }
        }
        int temp = A[i];
        A[i] = A[r];
        A[r] = temp;
        return i;
    }

    public static void quicksort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }

    public static void quicksort(int[] A) {
        if (A != null && A.length > 1) {
            quicksort(A, 0, A.length - 1);
        }
    }
}
