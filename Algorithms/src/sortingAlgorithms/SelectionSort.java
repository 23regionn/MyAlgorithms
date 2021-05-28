package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{99, 55, 88, 35, 96, 42, 75, 64, 21, 7, 15, 1, 66};

        for (int step = 0; step <  array.length; step++){
            printMassive(array);
            int index = min(array, step);

            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;
        }
    }


    public static int min(int[] arr, int start){
        int minIndex = start;
        int minValue = arr[start];
        for (int i = start + 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printMassive(int[] mass){
        System.out.println(Arrays.toString(mass));
    }
}
