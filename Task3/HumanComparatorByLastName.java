package Task3;

import java.util.Comparator;

public class HumanComparatorByLastName implements Comparator<Human> {
    @Override
    public int compare(Human first, Human second) {
        return first.getSurname().compareTo(second.getSurname());
    }
}
