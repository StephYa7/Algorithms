package Sort;

public class heapSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 22, 11, 35, 67, 12, 81, 3, 57, 14, 8, 99, 19, 71, 13, 77};
        heapSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void heapify(int list[], int listLength, int root) {
        int largest = root;
        int l = 2 * root + 1;
        int r = 2 * root + 2;
        if (l < listLength && list[l] > list[largest]) largest = l;
        if (r < listLength && list[r] > list[largest]) largest = r;
        if (largest != root) {
            swap(list, root, largest);
            heapify(list, listLength, largest);
        }
    }

    public static void heapSort(int list[], int listLength) {
        for (int i = listLength / 2 - 1; i >= 0; i--)
            heapify(list, listLength, i);

        for (int i = listLength - 1; i >= 0; i--) {
            swap(list, 0, i);
            heapify(list, i, 0);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int buffer = array[i];
        array[i] = array[j];
        array[j] = buffer;
    }

    public static void heapSort(int[] array) {
        heapSort(array, array.length);
    }


}