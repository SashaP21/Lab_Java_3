package Task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrimesGenerator implements Iterable<Integer> {
    private final int count;

    public PrimesGenerator(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int generated = 0;
            private int current = 1;

            @Override
            public boolean hasNext() {
                return generated < count;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                current++;
                while (!isPrime(current)) {
                    current++;
                }
                generated++;
                return current;
            }
        };
    }

    private static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}