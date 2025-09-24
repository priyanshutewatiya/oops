import java.util.ArrayList;

public class InsertAtFirst {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);

        int element = 5;

        list.add(0, element);

        System.out.println("After inserting at first position: " + list);
    }
}

