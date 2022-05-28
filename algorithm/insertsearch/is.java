package java.algorithm.insertsearch;

public class is {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int min = 1, max = 10;
        for (int i = 0; i < arr.length; i++)
        arr[i] = min + (int) (Math.random() * (max - min + 1));

        for (int element : arr)
        System.out.print(element+ " ");

        System.out.println();
        insertsearch(arr);
        for (int element : arr)
            System.out.print(element+" ");
    }

    static void insertsearch(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int temp=0;
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                for(int element: arr)
                    System.out.print(element+ " ");
                System.out.println();
                }
            }
        }
    }
}
