import java.util.Arrays;

public class ArrayParser {
    public static int[] parse(String input){
        try{
            return Arrays.stream(input.split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        } catch(NumberFormatException e){
            throw new IllegalArgumentException("Invalid input: please enter integers separated by spaces.");
        }
    }
}
