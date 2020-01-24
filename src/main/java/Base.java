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
        Calculator calculator = new Calculator();
        calculator.calculate();
    }
}
