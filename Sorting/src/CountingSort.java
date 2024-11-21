import java.util.Arrays;

public class CountingSort implements SortingAlgo{
    @Override
    public void sort(int[] array) {
        System.out.println("Starting Counting Sort...");
        int max = Arrays.stream(array).max().orElseThrow();
        int min = Arrays.stream(array).min().orElseThrow();
        int range = max - min + 1;

        int[] count = new int[range];
        for (int num : array) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                array[index++] = i + min;
                System.out.printf("Placed %d at index %d: %s%n", i + min, index - 1, Arrays.toString(array));
            }
        }
    }
}
