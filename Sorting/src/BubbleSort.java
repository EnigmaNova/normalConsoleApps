import java.util.Arrays;

public class BubbleSort implements SortingAlgo{
    @Override
    public void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("Step " + (i * (n - 1) + j + 1) + ": " + Arrays.toString(arr));
            }
        }
    }
}
