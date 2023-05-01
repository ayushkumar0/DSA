package BasicSortingAlgorithms;

import java.util.*;

public class InbuiltSort {
    public static void printArr(int[] arr){
        for(int j : arr) {
            System.out.print(j);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        Arrays.sort(arr);
        printArr(arr);
    }
}
