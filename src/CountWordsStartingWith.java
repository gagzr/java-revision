import java.util.List;

public class CountWordsStartingWith {
    public static void main(String[] args){
        // .filter() = functional interface to filter streams based on given condition
        //.count()= count the items in the stream pipeline -> Used for direct counting
        long count = List.of("Java","C++","Java","SQL","Python").stream().filter(w->w.startsWith("J")).count();
        System.out.println(count);
    }
}
