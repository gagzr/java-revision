import java.util.List;

public class ConvertAllStringsToUpperCase {
    public static void main(String[] args){
        List<String> names = List.of("alice","bob","charlie");
        // .map() = Used to transform stream data
        // String::toUpperCase = Method Reference, shortand to (String s)-> s.toUpperCase()
        // :: known as reference Operator, often used with functional interfaces
        // .toList() used to collect elements of a stream to an immutable list
        List<String> upper = names.stream().map(String::toUpperCase).toList();
        System.out.println(upper);
    }
}
