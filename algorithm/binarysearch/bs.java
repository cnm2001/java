package java.algorithm.binarysearch;
public class bs {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(binarysearch(arr, 5));
    }

    static int binarysearch(int[] arr, int num) {
        int left = 0, right = arr.length - 1;
        int mid;
        int i = 0;

        // System.out.println(arr[left]);
        // System.out.println(arr[right]);

        if (num < arr[0] || num > arr[arr.length - 1])
            return -1;

        else {
            while (left <= right) {
                i += 1;
                mid = (left + right) / 2;
                if (num == arr[mid]) {
                    System.out.println(i);
                    return mid;
                } else if (num > arr[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            System.out.println(i);
            return -2;
        }
    }
}