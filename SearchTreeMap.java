import java.util.TreeMap;

public class SearchTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        System.out.println("TreeMap: " + map);

        String valueToSearch = "Python";
        if (map.containsValue(valueToSearch)) {
            System.out.println("Value '" + valueToSearch + "' found!");
        } else {
            System.out.println("Value not found.");
        }
    }
}

