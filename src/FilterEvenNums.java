import java.util.List;

public class FilterEvenNums {
    public static void main(String[] args){
        List<Integer> evenNums = List.of(1,2,3,4,5,6,7,8,9,10).stream().filter(x->x%2==0).toList();
        System.out.println(evenNums);
    }
}
