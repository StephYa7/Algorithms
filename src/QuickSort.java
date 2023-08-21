public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 22, 11, 35, 67, 12, 81, 3, 11, 57, 14, 8, 99, 19, 71, 13, 77, 20};
        quickSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            int partitionIndex = i + 1;
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}