import Task1.Task1;
import Task2.PrimesGeneratorTest;
import Task3.Task3;
import Task4.Task4;
import Task5.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String instruction = """
                Выбор задания:
                0 - выход
                1 - задание №1
                2 - задание №2
                3 - задание №3
                4 - задание №4
                5 - задание №5
                """;

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println(instruction);
            System.out.println("Введите номер задания");
            if (!scanner.hasNextInt()){
                System.out.println("Введите число");
                scanner.next();
                continue;
            }
            choice = scanner.nextInt();

            switch (choice){
                case 0 -> System.out.println("Выход");
                case 1 -> Task1.run();
                case 2 -> PrimesGeneratorTest.run();
                case 3 -> Task3.run();
                case 4 -> Task4.run();
                case 5 -> Task5.run();
                default -> System.out.println("Нет задания с таким номером");
            }

        } while (choice != 0);
    }
}
