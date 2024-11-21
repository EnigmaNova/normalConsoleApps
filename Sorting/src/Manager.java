import java.util.Arrays;

public class Manager {
    private String algoName;
    private int[] arr;

    public Manager(String algoName, String inputArray){
        this.algoName = algoName;
        this.arr = parseArray(inputArray);
    }

    private int[] parseArray(String input){
        return ArrayParser.parse(input);
    }

    public void sortArray(){
        SortingAlgo algo = chooseAlgo(algoName);

        if(algo == null){
            System.out.println("Error: Unknown sorting algorithm \"" + algoName + "\".");
            return;
        }

        System.out.println("Using algorithm: " + algoName);
        algo.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private SortingAlgo chooseAlgo(String name){
        switch(name.toLowerCase()){
            case "bubble":
                return new BubbleSort();
            case "selection":
                return new SelectionSort();
            case "quick":
                return new QuickSort();
            case "insertion":
                return new InsertionSort();
            case "merge":
                return new MergeSort();
            case "heap":
                return new HeapSort();
            case "tim":
                return new Timsort();
            case "counting":
                return new CountingSort();
            case "radix":
                return new RadixSort();                    
            default:
                return null;        
        }
    }
}
