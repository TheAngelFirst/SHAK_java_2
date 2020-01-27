/**
 * @author ShiryaevAK
 * @see Array4#fillArrayRand Заполнение массива случайными значениями [-10;10].
 */
/*
Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 */
public class Array4 {
    public static void changArray(String[] args) {
        int posMax = 0, posMin = 0, maxNeg = Integer.MIN_VALUE, minPos = Integer.MAX_VALUE, tmp;
        int[] arr = new int[20];
        fillArrayRand(arr);
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
            if (arr[i] > maxNeg && arr[i] < 0) {
                posMax = i;
                maxNeg = arr[i];
            } else if (arr[i] < minPos && arr[i] > 0) {
                posMin = i;
                minPos = arr[i];
            }
        }
        if (maxNeg >= -10 && minPos <= 10) {
            System.out.printf("\nМаксимальный отрицательный: %d\nМинимальный положительный: %d\n", maxNeg, minPos);
            tmp = arr[posMax];
            arr[posMax] = arr[posMin];
            arr[posMin] = tmp;
            System.out.println("Измененный массив:");
            for (int i : arr)
                System.out.printf("%d\t", i);
        } else
            System.out.printf("\nМассив не содержит отрицательные и положительные элементы одновременно.");

    }

    private static void fillArrayRand(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (20 + 1)) - 10;
        }
    }
}
