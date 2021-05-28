package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{99, 55, 88, 35, 96, 42, 75, 64, 21, 7, 15, 1, 66};
        printMassive(array);
        sortInsert(array);
        printMassive(array);




    }
    private static void sortInsert(int[] array) {
        for (int i = 1; i < array.length; i++) {

            int current = array[i];
            int j = i;

            while (j > 0 && array[j -1] > current ){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }


    public static void printMassive(int[] mass){
        System.out.println(Arrays.toString(mass));
    }

}
