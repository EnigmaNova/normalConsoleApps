import java.util.Arrays;

public class RadixSort implements SortingAlgo{
    @Override
    public void sort(int[] array) {
        System.out.println("Starting Radix Sort...");
        int max = Arrays.stream(array).max().orElseThrow();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(array, exp);
            System.out.printf("After sorting by digit place %d: %s%n", exp, Arrays.toString(array));
        }
    }

    private void countingSortByDigit(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int num : array) {
            count[(num / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (array[i] / exp) % 10;
            output[--count[digit]] = array[i];
        }

        System.arraycopy(output, 0, array, 0, n);
    }
}
