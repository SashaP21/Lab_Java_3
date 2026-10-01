package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrimesGeneratorTest {
    public static void run() {
        int n = 10;
        PrimesGenerator generator = new PrimesGenerator(n);
        List<Integer> primes = new ArrayList<>();

        Iterator<Integer> iterator = generator.iterator();
        while (iterator.hasNext()) {
            primes.add(iterator.next());
        }

        System.out.println("Простые числа в прямом порядке: " + primes);
        Collections.reverse(primes);
        System.out.println("Простые числа в обратном порядке: " + primes);
    }
}
