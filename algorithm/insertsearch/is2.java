package java.algorithm.insertsearch;
public class is2 {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        int[] arr = { 8, 7, 3, 5, 2, 4 };
        int min = 1, max = 10;
        for (int i = 0; i < arr.length; i++)
            // arr[i] = min + (int) (Math.random() * (max - min + 1));

            for (int element : arr)
                System.out.print(element + " ");

        System.out.println();

        insertsearch(arr);
        for (int element : arr)
            System.out.print(element + " ");
    }

    static void insertsearch(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp)
                arr[j + 1] = temp;
            j--;
            arr[j + 1] = temp;
            for (int element : arr)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}
