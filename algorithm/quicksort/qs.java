package java.algorithm.quicksort;
/**
 * qs
 */
public class qs {

    public static void main(String[] args) {
        int[] arr = { 6, 8, 7, 3, 5, 2, 4 };
        for (int element : arr)
            System.out.print(element + " ");
        System.out.println();

        quicksort(arr, 0, arr.length - 1);
        for (int element : arr)
            System.out.print(element + " ");
        System.out.println();

    }

    static void quicksort(int[] arr, int left, int right) {
        int mid;
        if (left < right) {
            mid = partition(arr, left, right);
            quicksort(arr, left, mid - 1);
            quicksort(arr, left + 1, right);
        }

    }

    static int partition(int[] arr, int left, int right) {
        int temp = arr[left];
        while (left < right) {
            while (arr[left] <=arr[right] && left < right) {
                right--;
            }
            arr[left] = arr[right];

            // for (int element : arr)
            // System.out.print(element + " ");
            // System.out.println();

            while (arr[left] <= arr[right] && left < right) {
                left++;
            }
            arr[right] = arr[left];

            // for (int element : arr)
            // System.out.print(element + " ");
            // System.out.println();
        }
        arr[left]=temp;
        return left;
    }
}