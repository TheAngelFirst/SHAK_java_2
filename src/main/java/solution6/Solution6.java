package solution6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author ShiryaevAK
 * @see Solution6#readWords Чтение слов из файла
 * @see Solution6#displayStatistics  Вывод статистики
 */
/*
Есть входной файл с набором слов, написанных через пробел

Необходимо:

Прочитать слова из файла.

Отсортировать в алфавитном порядке.

Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль

Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */
public class Solution6 {
    private String url = "src/main/java/solution6/text.txt";
    private int maxNumberOfRepetitions = 0;
    private String wordWithMaxNumberOfRepetitions = null;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMaxNumberOfRepetitions() {
        return maxNumberOfRepetitions;
    }


    public String getWordWithMaxNumberOfRepetitions() {
        return wordWithMaxNumberOfRepetitions;
    }

    public void displayStatistics() {
        List<String> words = readWords(url);
        Set<String> sortedSet = new TreeSet<String>(words); //Создаем TreeSet, в котором отсортированный список слов без повторений
        Collections.sort(words); //Сортированный список слов с повторениями
        System.out.printf("Статистика повторений слов:\n");
        for (String word : sortedSet) {
            int a = Collections.frequency(words, word);//нахождение числа повторений
            System.out.printf("\"%s\" - %d;\n", word, a);//вывод статистики повторений слов
            if (a > maxNumberOfRepetitions) {//ищем первое самое частое слово
                maxNumberOfRepetitions = a;
                wordWithMaxNumberOfRepetitions = word;
            }
        }
        System.out.printf("Самое часто повторяющееся слово - \"%s\", всречается %d раз(а).\n", wordWithMaxNumberOfRepetitions, maxNumberOfRepetitions);
    }

    private List<String> readWords(String url) {
        BufferedReader reader = null;
        List<String> words;
        String line = null;
        try {
            reader = new BufferedReader(new FileReader(url));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        words = new ArrayList<String>();
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            words.addAll(Arrays.asList(line.split("\\s")));
        }
        return words;
    }
}
