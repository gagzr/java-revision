import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfStringsToMap {
    public static void main(String[] args){
        Map<String, Integer> map= List.of("Java","Go","Bash","SQL").stream()
                .collect(Collectors.toMap(w-> w,String::length));
        System.out.println(map);
        //Collectors : utility class that provides pre-defined static method to gather stream data
        // common methods include .toList(), .toMap(), .toSet()
    }
}
