package calculator5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ShiryaevAK
 */
/*
Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
 */
public class Calculator5 implements InterfaceCalculator5 {

    private double a = 0, b = 0;
    private String operation = "";
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String calculateResult() {
        try {
            System.out.printf("Введите знак операции (\"+\" - сложение, \"-\" - вычитание, \"/\" - деление, \"*\" - умножение): ");
            operation = reader.readLine();
            System.out.printf("Введите первое число : ");
            a = Double.parseDouble(reader.readLine());
            System.out.printf("Введите второе число : ");
            b = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return calculateResult(a, operation, b);
    }

    public String calculateResult(double a, String operation, double b) {
        switch (operation) {
            case ("+"): //Сложение
                return String.valueOf(Sum(a, b));
            case ("-"): //Вычетание
                return String.valueOf(Subtraction(a, b));
            case ("/"): //Деление
                return String.valueOf(Division(a, b));
            case ("*"): //Умножение
                return String.valueOf(Multiplication(a, b));
        }
        System.out.println("Ошибка ввода.");
        return calculateResult();
    }

    public double Sum(double a, double b) {
        return a + b;
    }

    public double Subtraction(double a, double b) {
        return a - b;
    }

    public double Multiplication(double a, double b) {
        return a * b;
    }

    public double Division(double a, double b) {
        return a / b;
    }
}
