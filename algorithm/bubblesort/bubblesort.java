package java.algorithm.bubblesort;
public class bubblesort {

    public static void main(String[] args) {
        int[] arr = { 8, 7, 3, 5, 2, 4 };
        sort(arr);
        // System.out.println(arr[2+1]);
        for (int num : arr)
            System.out.println(num);
    }

    static void sort(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                return;
        }
        return;
    }
}