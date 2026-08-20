import java.util.List;

public class CheckPositiveElements {
    public static void main(String[] args){
        //List.of = Create a list
        // .stream()= convert the list to stream
        // .allMatch() = terminal operation that checks
        // if every element in the stream satisfies the given condition
        boolean allPositive = List.of(1,2,3,4,5).stream().allMatch(n -> n>0);
        System.out.println(allPositive);
    }
}
