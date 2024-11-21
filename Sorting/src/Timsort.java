import java.util.Arrays;

public class Timsort implements SortingAlgo{
    private static final int RUN = 32;
    @Override
    public void sort(int[] array) {
        System.out.println("Starting Timsort...");
        int n = array.length;

        for (int i = 0; i < n; i += RUN) {
            insertionSort(array, i, Math.min((i + RUN - 1), n - 1));
        }

        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = Math.min((left + size - 1), (n - 1));
                int right = Math.min((left + 2 * size - 1), (n - 1));

                merge(array, left, mid, right);
                System.out.printf("Merged sections [%d-%d] and [%d-%d]: %s%n", left, mid, mid + 1, right, Arrays.toString(array));
            }
        }
    }

    private void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= left && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
            System.out.printf("Insertion sort step in range [%d-%d]: %s%n", left, right, Arrays.toString(array));
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = Arrays.copyOfRange(array, left, right + 1);
        int i = 0, j = mid - left + 1, k = left;

        while (i <= mid - left && j < temp.length) {
            if (temp[i] <= temp[j]) {
                array[k++] = temp[i++];
            } else {
                array[k++] = temp[j++];
            }
        }

        while (i <= mid - left) array[k++] = temp[i++];
        while (j < temp.length) array[k++] = temp[j++];
    }
}
