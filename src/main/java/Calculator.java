import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Calculator {
    private int numOp = 0;
    private double x1 = 0, x2 = 0, result = 0;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    void calculate(){
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
