
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 22, 11, 35, 67, 12, 81, 3, 57, 14, 8, 99, 19, 71, 13, 77};
        bubbleSort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    isSorted = false;
                }
            }
        }
    }
}