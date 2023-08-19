public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 22, 11, 35, 67, 12, 81, 3, 57, 14, 8, 99, 19, 71, 13, 77};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minindex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minindex]) {
                    minindex = j;
                }
            }
            if (array[i] != array[minindex]) {
                int buff = array[i];
                array[i] = array[minindex];
                array[minindex] = buff;
            }
        }
    }
}