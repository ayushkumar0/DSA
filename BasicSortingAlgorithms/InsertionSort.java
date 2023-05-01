package BasicSortingAlgorithms;

public class InsertionSort {

    public  static  void  insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            int temp = arr[i];
            int prev = i -1;
            //finding out the correct pos to insert
            while (prev>=0 && arr[prev]>temp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for(int j : arr) {
            System.out.print(j);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        insertionSort(arr);
    }
}
