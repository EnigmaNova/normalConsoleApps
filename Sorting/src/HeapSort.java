import java.util.Arrays;

public class HeapSort implements SortingAlgo{
    @Override
    public void sort(int[] array) {
        System.out.println("Starting Heap Sort...");
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            System.out.printf("Moved %d to position %d: %s%n", array[i], i, Arrays.toString(array));
            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            System.out.printf("Heapify: Swapped %d and %d. Result: %s%n", array[i], array[largest], Arrays.toString(array));
            heapify(array, n, largest);
        }
    }
}
