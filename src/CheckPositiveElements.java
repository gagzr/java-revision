import java.util.List;

public class CheckPositiveElements {
    public static void main(String[] args){
        //List.of = Static factory method to Create an immutable list
        // .stream()= convert the list to stream
        // .allMatch() = terminal operation that checks
        // if every element in the stream satisfies the given condition
        // return true or false
        boolean allPositive = List.of(1,2,3,4,5).stream().allMatch(n -> n>0);
        System.out.println(allPositive);
    }
}
