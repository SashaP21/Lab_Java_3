package Task5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void run() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println("Исходная: " + map);
        System.out.println("После обмена: " + swap(map));
    }

    public static <K, V> Map<V, K> swap(Map<K, V> map) {
        Map<V, K> swapped = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            swapped.put(entry.getValue(), entry.getKey());
        }
        return swapped;
    }
}
