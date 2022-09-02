import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task3() {
        System.out.println("Задача 2.");

    }

    private static void task2() {
        System.out.println("Задача 1. второй способ");

        int numberOfRepetitions = 20; // количество посетителей сайта
        for (int i = 0; i < numberOfRepetitions; i++) {

            int clientOS = ThreadLocalRandom.current().nextInt(2);

            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");

            }
        }
    }


    private static void task1() {
        System.out.println("Задача 1. первый способ");

        int numberOfRepetitions = 20;
        for (int i = 0; i < numberOfRepetitions; i++) { // цикл задан для удобства


            int multiplier = 10; // множитель рандомного числа

            int random_number = (int) (Math.random() * multiplier); // Умножаю случайно сгенерированное число на 10, для того что бы получить целое числовое значение.
            if (random_number <= 5) { // Задаю диапазон значений, если условие выполняется присваиваю clientOS значение 0 и вывожу нужное сообщение.
                // int clientOS = 0;
                System.out.println("Установите версию приложения для iOS по ссылке");
                } else { // иначе присваиваю clientOS значение 1 и вывожу нужное сообщение.
                // int clientOS = 1;
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }
