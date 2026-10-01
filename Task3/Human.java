package Task3;

import java.util.Objects;

public class Human implements Comparable<Human> {
    private final String name;
    private final String surname;
    private final int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human other) {
        int result = surname.compareTo(other.surname);
        if (result != 0)
            return result;
        result = name.compareTo(other.name);
        if (result != 0)
            return result;
        return Integer.compare(age, other.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Human))
            return false;
        Human other = (Human) obj;
        return age == other.age && name.equals(other.name) && surname.equals(other.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return surname + " " + name + " (" + age + ")";
    }
}
