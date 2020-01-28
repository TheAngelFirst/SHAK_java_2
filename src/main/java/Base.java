import calculator5.Calculator5;
import sweets4.Candy4;
import sweets4.Jellybean4;
import sweets4.Sweetness4;
import sweets4.Сhocolate4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ShiryaevAK
 * @see Base#makeNewYearGift() Задание 4.
 */

public class Base {
    public static void main(String[] args) {

        /*
        Программа должна выполнять одно из заданий на выбор.
        Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
         */
        int choice = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("Введите номер программы (1 - калькулятор, 2 - поиск максимума в массиве слов): ");
            choice = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e);
        }
        switch (choice) {
            case (1): //Запуск калькулятора
                System.out.println(new Calculator5().calculateResult());
                break;
            case (2): //Запуск поиска максимума в массиве строк
                new MaxElement3().findMaxInArray();
                break;
            default:
                break;
        }
    }

    /**
     * Задание 4. Процедура формирования подарка
     */
    /*
    Формируется новогодний подарок.
    Он может включать в себя разные сладости (Candy, Jellybean, etc.) У каждой сладости есть название, вес, цена и свой уникальный параметр.
    Необходимо собрать подарок из сладостей. Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
    */
    static void makeNewYearGift() {
        int totalWeight = 0;
        double cost = 0;
        Candy4 candy = new Candy4("Stevita", 40, 282.40, "Красный");
        Jellybean4 jellybean = new Jellybean4("Jelly Belly Bertie Bott's", 54, 333, "Сахарная вата");
        Сhocolate4 chocolate = new Сhocolate4("Шоколад Аленка молочный", 15, 16, false);
        Sweetness4 newYearPresent[] = {candy, jellybean, chocolate};
        System.out.println("Состав подарка:");
        for (Sweetness4 sweetness : newYearPresent) {
            System.out.println(sweetness.toString());
            totalWeight += sweetness.getWeightGrams();
            cost += sweetness.getPrice();
        }
        System.out.printf("--------------------------------------------\nВес подарка: %d грамм. Стоимость: %.2f\n", totalWeight, cost);
    }
}
