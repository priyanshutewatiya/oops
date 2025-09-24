import java.util.*;

public class IterableToCollection {
    public static void main(String[] args) {
        // Iterable (List implements Iterable)
        List<String> list = Arrays.asList("A", "B", "C", "D");

        // Convert Iterable to Collection
        Collection<String> collection = new ArrayList<>();
        for (String item : list) {
            collection.add(item);
        }

        System.out.println("Converted Collection: " + collection);
    }
}

