public class Array4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArrayRand(arr);
        for (int i = 0; i < arr.length; i++) {

        }
    }

    private static void fillArrayRand(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (20 + 1)) - 10;
        }
    }
}
