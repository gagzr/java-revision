import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args){
        //Function.identity()= return the function itself
        //Collectors.counting() = returns the total number of elements passing the stream pipeline
        Map<String, Long> count = Arrays.asList("Java","SQL","C++","SQL","Java","SQL").stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);
    }
}
