package java.algorithm.selectsort;
import java.lang.Math;

public class ss {
    public static void main(String[] args) {
        // int[] arr = { 6, 8, 7, 3, 5, 2, 4 };
        // int[] arr={3,2,4,1,5,7,9,6,8};
        int arr[] = new int[20];
        int min = 1, max = 20;
        for (int i = 0; i < arr.length; i++)
        arr[i] = min + (int) (Math.random() * (max - min + 1));

        Math.random();
        for (int element : arr)
            System.out.print(element + " ");

        System.out.println();
        selectsort(arr);
        for (int element : arr)
            System.out.print(element + " ");
    }

    static void selectsort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
