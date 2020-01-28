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
/*
Добавить обработку исключений в задание с ООП калькуляторам (например, исключение может возникнуть при делении на ноль)
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
                return  String.format("%.4f", Sum(a, b));
            case ("-"): //Вычетание
                return String.format("%.4f", Subtraction(a, b));
            case ("/"): //Деление
                try {
                    return String.format("%.4f", Division(a, b));
                } catch (DivisionByZeroException7 divisionByZeroException7) {
                    divisionByZeroException7.printStackTrace();
                    break;
                }
            case ("*"): //Умножение
                return String.format("%.4f", Multiplication(a, b));
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

    public double Division(double a, double b) throws DivisionByZeroException7 {
        if (b != 0.0)
            return a / b;
        else
            throw new DivisionByZeroException7();
    }
}
