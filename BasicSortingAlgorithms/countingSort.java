package BasicSortingAlgorithms;

public class countingSort {

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest +1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j =0;
        for (int i=0; i<count.length; i++){
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        countingSort(arr);
    }
}
