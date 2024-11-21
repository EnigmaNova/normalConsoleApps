import java.util.Arrays;

public class QuickSort implements SortingAlgo{
    @Override
    public void sort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            System.out.println("Pivot placed at index " + pivotIndex + ": " + Arrays.toString(arr));
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println("Swapping " + arr[j] + " and " + arr[i] + ": " + Arrays.toString(arr));
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
