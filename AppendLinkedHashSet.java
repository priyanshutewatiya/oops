import java.util.LinkedHashSet;

public class AppendLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        System.out.println("Before: " + set);

        set.add("Orange");

        System.out.println("After appending: " + set);
    }
}

