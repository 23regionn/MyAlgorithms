package sortingAlgorithms;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
//        int[] array = new int[]{99, 55, 88, 35, 96, 42, 75, 64, 21, 7, 15, 1, 66};
        int[] array = new int[]{99, 55, 88, 35, 96, 42, 75, 64};
        printMassive(array);
        quickSort(array, 0, array.length -1 );
        printMassive(array);

    }

    private static void quickSort(int[] arr, int from, int to){
        if(from < to){
           int divideIndex = partition(arr, from, to);

           printMassive(arr);

           quickSort(arr, from, divideIndex -1);

           quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while (leftIndex <= rightIndex){

            while (arr[leftIndex] < pivot){
                leftIndex++;
            }

            while (arr[rightIndex] > pivot){
                rightIndex--;
            }

            if (leftIndex <= rightIndex){
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printMassive(int[] mass){
        System.out.println(Arrays.toString(mass));
    }
}
