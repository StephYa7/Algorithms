public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 22, 11, 35, 67, 12, 81, 3, 57, 14, 8, 99, 19, 71, 13, 77};
        mergeSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }


    public static void mergeSort(int list[]) {
        if (list.length < 2) {
            return;
        }
        int mid = list.length / 2;
        int[] leftArr = new int[mid];
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = list[i];
        }
        int[] rightArr = new int[list.length - mid];
        for (int i = mid; i < list.length; i++) {
            rightArr[i - mid] = list[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(list, leftArr, rightArr);

    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int minLeft = 0;
        int minRight = 0;
        int min = 0;

        while (minLeft < leftArr.length && minRight < rightArr.length) {
            if (leftArr[minLeft] <= rightArr[minRight]) {
                arr[min] = leftArr[minLeft];
                minLeft++;
            }
            else  {
                arr[min] = rightArr[minRight];
                minRight++;
            }
            min++;
        }
        while (minLeft < leftArr.length) {
            arr[min] = leftArr[minLeft];
            minLeft++;
            min++;
        }
        while (minRight < rightArr.length) {
            arr[min] = rightArr[minRight];
            minRight++;
            min++;
        }
    }
}