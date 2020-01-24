import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ShiryaevAK
 */
/*
Поиск максимального элемента в массиве. Для начала задать массив слов.
Размерность массива произвольна, задается в консоли.
После чего в консоли вводятся слова в количестве равном заданной длине массива.
В полученном массиве необходимо найти самое длинное слово.
Результат вывести на консоль
 */
public class MaxElement3 {
    private String[] arr;
    private int size = 0;
    private String longestWord = "";
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    void findMaxInArray() {
        try {
            System.out.printf("Введите размер массива слов: ");
            size = Integer.parseInt(reader.readLine());
            arr = new String[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("Введите %dое слово массива: ", i + 1);
                arr[i] = reader.readLine();
                if (arr[i].length() > longestWord.length())
                    longestWord = arr[i];
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e);
        }
        System.out.printf("\"%s\" - максимальный элемент массива.", longestWord);
    }
}
