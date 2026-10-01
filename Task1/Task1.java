package Task1;

import java.util.*;

public class Task1 {
    public static void run() {
        int n = 15;
        Integer[] array = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++)
            array[i] = random.nextInt(101);
        System.out.println("1. Массив: " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("2. Список: " + list);

        Collections.sort(list);
        System.out.println("3. Сортировка по возрастанию: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("4. Сортировка в обратном порядке: " + list);

        Collections.shuffle(list);
        System.out.println("5. Перемешивание: " + list);

        Collections.rotate(list, 1);
        System.out.println("6. Циклический сдвиг: " + list);

        List<Integer> unique = new ArrayList<>();
        for (Integer number : list) {
            if (!unique.contains(number))
                unique.add(number);
        }
        System.out.println("7. Уникальные элементы: " + unique);

        List<Integer> duplicates = new ArrayList<>();
        for (Integer number : list) {
            if (Collections.frequency(list, number) > 1)
                duplicates.add(number);
        }
        System.out.println("8. Дублирующиеся элементы: " + duplicates);

        Integer[] fromList = list.toArray(new Integer[0]);
        System.out.println("9. Массив из списка: " + Arrays.toString(fromList));

        System.out.println("10. Количество вхождений:");
        Map<Integer, Integer> frequency = new HashMap<>();
        for (Integer number : list)
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet())
            System.out.println("Количество вхождений " + entry.getKey() + " - " + entry.getValue());
    }
}
