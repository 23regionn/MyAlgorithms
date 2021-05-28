package searchAlgorithms;

import sortingAlgorithms.QuickSort;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{99, 55, 88, 35, 96, 42, 75, 64, 25, 75, 84, 35, 62, 11, 89, 53, 96, 12, 33, 28};
        printMassive(array);
//        qSort(array, 0, array.length-1);
        QuickSort.qSort(array, 0, array.length -1);
        printMassive(array);
        System.out.println(binarySearch(array, 0, array.length-1, 96));



    }
    private static int  binarySearch(int[] arr, int startIndex, int endIndex, int element){
        if (endIndex >= startIndex){
            int middleIndex = startIndex + (endIndex - startIndex)/2;

            if (arr[middleIndex] == element){
                return middleIndex;
            }

            if (arr[middleIndex] > element){
                return binarySearch(arr, startIndex, middleIndex-1, element);
            }
            else{
                return binarySearch(arr, middleIndex + 1, endIndex, element);
            }
        }
        return -1;
    }
    public static void printMassive(int[] mass){
        System.out.println(Arrays.toString(mass));
    }
}
