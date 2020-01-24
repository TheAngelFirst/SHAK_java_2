import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ShiryaevAK
 */

/*
* 1. Начинаем писать калькулятор:
*Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе результата в консоль. Полученный результат округлять до 4-х знаков после запятой.
*2. Запушить проект в свой репозиторий на GitHub
*Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
* */

public class Base {
    public static void main(String[] args) {
        int numOp = 0;
        double x1 = 0, x2 = 0, result = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("Введите номер операции (1 - сложение, 2 - вычитание, 3 - деление, 4 - умножение): ");
            numOp = Integer.parseInt(reader.readLine());
            System.out.printf("Введите первое число : ");
            x1 = Double.parseDouble(reader.readLine());
            System.out.printf("Введите второе число : ");
            x2 = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e);
        }
        switch (numOp) {
            case (1): //Сложение
                result = x1 + x2;
                break;
            case (2): //Вычетание
                result = x1 - x2;
                break;
            case (3): //Деление
                result = x1 / x2;
                break;
            case (4): //Умножение
                result = x1 * x2;
                break;
            default:
                break;
        }
        System.out.printf("Результат: %.4f", result);
    }
}
