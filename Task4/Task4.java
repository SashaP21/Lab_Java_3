package Task4;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void run() {
        String text = "hello world test java Hello Test";
        System.out.println("Текст: " + text);

        String[] words = text.toLowerCase().split("[^a-z]+");
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty())
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Различные слова: " + frequency.keySet());
        System.out.println("Частота слов:");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
