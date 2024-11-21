import java.util.Arrays;

public class InsertionSort implements SortingAlgo{
    @Override
    public void sort(int[] array) {
        System.out.println("Starting Insertion Sort...");
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            System.out.printf("Step %d: Moved %d to index %d. Result: %s%n", i, key, j + 1, Arrays.toString(array));
        }
    }
}
