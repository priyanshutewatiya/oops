import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original LinkedList: " + list);

        Iterator<String> itr = list.descendingIterator();
        System.out.print("Reverse Order: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
