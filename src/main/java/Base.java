import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ShiryaevAK
 */

/*
Программа должна выполнять одно из заданий на выбор.
Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */

public class Base {
    public static void main(String[] args) {
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
                new Calculator2().calculate();
                break;
            case (2): //Запуск поиска максимума в массиве строк
                new MaxElement3().findMaxInArray();
                break;
            default:
                break;
        }
    }
}
