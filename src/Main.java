import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    private static void task6() {
        System.out.println("Задание 5.");

        Scanner one = new Scanner(System.in );
        System.out.print("Укажите номер месяца: "); // задаем номер через консоль.
        int monthNumber = one.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("Январь, принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль, принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март, принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель, принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май, принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь, принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль, принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август, принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь, принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь, принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь, принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь, принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    private static void task5() {
        System.out.println("Задание 4.");

        int deliveryDistance = 95; // дистанцию до клиента

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + " 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + " 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + " 3");
        } else {
            System.out.println("Доставки не будет"); }
    }

    private static void task4() {
        System.out.println("Задание 3.");

        Scanner one = new Scanner(System.in );
        System.out.print("Укажите год: "); // задаем год через консоль.
        int year = one.nextInt();

            // Шаг 1. Узнать делится ли год на 4 без остатка.
            int stepOne = year % 4; // делим год на 4
            boolean remainsDivideOne = stepOne == 0; // выясняем остаток равен 0 или нет.

            // Шаг 2. Узнать делится ли год на 100 без остатка
            int stepTwo = year % 100; // делим год на 100
            boolean remainsDivideTwo = stepTwo == 0; // выясняем остаток равен 0 или нет.

            // Шаг 3. Узнать делится ли год на 400 без остатка
            int stepThree = year % 400; // делим год на 400
            boolean remainsDivideThree = stepThree == 0; // выясняем остаток равен 0 или нет.

            if (remainsDivideOne == false) { // step 1
                System.out.printf("%d год не является високосным \n", year);
            } else if (remainsDivideTwo == false) { // step 2
                System.out.printf("%d год является високосным \n", year);
            } else if (remainsDivideThree == false) { //step 3
                System.out.printf("%d год не является високосным \n", year);
            } else { // step 4
                System.out.printf("%d год является високосным \n", year);
            }

        // Step 1. year / 4 - (true - step 2/false - step 5)
        // Step 2. year / 100 - (true - step 3/false - step 4)
        // Step 3. year / 400 - (true - step 4/false - step 5)
        // Step 4. високосный год
        // Step 5. не високосный год

    }

    private static void task3() {
        System.out.println("Задача 2.");

        int visitorsPerHour = 18; // количество посетителей сайта
        for (int i = 0; i < visitorsPerHour; i++) {

            int clientOS = ThreadLocalRandom.current().nextInt(2); // класс для рандомных значений в заданном диапазоне 0-1.
            int clientDeviceYear = 2015; // маркер данных

            Random random = new Random(); // ещё один класс для рандомных значений.
            int min = 2007; // диапазон значений
            int max = 2022; // диапазон значений
            int diff = max - min;
            int randomPhoneReleaseYear = random.nextInt(diff + 1) + min; //год выпуска телефона
            boolean comparisonPhoneReleaseYear = clientDeviceYear < randomPhoneReleaseYear; // сравнение года выпуска с маркером данных.

            if (clientOS == 0) {
                if (comparisonPhoneReleaseYear == true) {
                System.out.println("«Установите версию приложения для iOS по ссылке».");
                } else {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
                }
            }

            if (clientOS != 0) {
                if (comparisonPhoneReleaseYear == false) {
                    System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
                } else {
                    System.out.println("«Установите версию приложения для Android по ссылке».");
                }
            }
        }
    }

    private static void task2() {
        System.out.println("Задача 1. второй способ");

        int numberOfRepetitions = 10; // количество посетителей сайта
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

        int numberOfRepetitions = 10;
        for (int i = 0; i < numberOfRepetitions; i++) { // цикл задан для удобства


            int multiplier = 10; // множитель рандомного числа

            int random_number = (int) (Math.random() * multiplier); // Умножаю случайно сгенерированное число на 10, для того что бы получить целое числовое значение.
            if (random_number <= 5) { // Задаю диапазон значений, если условие выполняется, присваиваю clientOS значение 0 и вывожу нужное сообщение.
                // int clientOS = 0;
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else { // иначе присваиваю clientOS значение 1 и вывожу нужное сообщение.
                // int clientOS = 1;
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
}
