package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] massive = new int[]{99, 55, 88, 35, 96, 42, 75, 64, 21, 7};
        printArr(massive);

        boolean isSorted= false;

       while (!isSorted){
           isSorted = true;
           for (int i = 1; i < massive.length; i++ ){
               if (massive[i] < massive[i - 1]){
                   int temp = massive[i];
                   massive[i] = massive[i-1];
                   massive[i-1] = temp;
                   isSorted = false;
               }
           }
           printArr(massive);
       }
    }


    public static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
