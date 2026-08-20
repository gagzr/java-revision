import java.util.List;

public class CheckPositiveElements {
    public static void main(String[] args){
        //List.of = Create a list
        // .stream()= convert the list to stream
        // .allMatch(takes arg)
        boolean allPositive = List.of(1,2,3,4,5).stream().allMatch(n -> n>0);
        System.out.println(allPositive);
    }
}
