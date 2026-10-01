package Task3;

import java.util.*;

public class Task3 {
    public static void run() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Иван", "Петров", 25));
        humans.add(new Human("Анна", "Сидорова", 20));
        humans.add(new Human("Олег", "Иванов", 25));
        humans.add(new Human("Иван", "Петров", 25));
        humans.add(new Human("Мария", "Иванова", 22));
        humans.add(new Human("Сергей", "Иванов", 30));
        humans.add(new Human("Елена", "Сидорова", 20));
        humans.add(new Human("Павел", "Петров", 19));
        System.out.println("1. Список: " + humans);

        HashSet<Human> hashSet = new HashSet<>(humans);
        System.out.println("2. HashSet: " + hashSet);

        LinkedHashSet<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("3. LinkedHashSet: " + linkedHashSet);

        TreeSet<Human> treeSet = new TreeSet<>(humans);
        System.out.println("4. TreeSet: " + treeSet);

        TreeSet<Human> byLastName = new TreeSet<>(new HumanComparatorByLastName());
        byLastName.addAll(humans);
        System.out.println("5. TreeSet по фамилии: " + byLastName);

        TreeSet<Human> byAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human first, Human second) {
                return Integer.compare(first.getAge(), second.getAge());
            }
        });
        byAge.addAll(humans);
        System.out.println("6. TreeSet по возрасту: " + byAge);
    }

    /*
    HashSet неупорядочен,
    LinkedHashSet сохраняет порядок добавления
    TreeSet сортирует по compareTo
    TreeSet с HumanComparatorByLastName сравнивает только фамилии
    TreeSet с анонимным компаратором сортирует по возрасту
    */
}
