package sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] massive = new int[]{99, 55, 88, 35, 96, 42, 75, 64};
        qSort(massive, 0, massive.length - 1);
        printMassive(massive);

    }
    public static void qSort(int[] arr, int first, int last){
        if (arr.length == 0){
            System.out.println("Non Massive");
            return;
        }
        if (first >= last){
            return;
        }
        int i, j;
        i = first;
        j = last;

        int opora = arr[(i + j)/2];

        do{
            while(arr[i] < opora){
                i++;
            }

            while(arr[j] > opora){
                j--;
            }

            if (i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (first < j){
            qSort(arr, first, j);
        }
        if (i < last){
            qSort(arr, i, last);
        }
    }

    public static void printMassive(int[] mass){
        System.out.println(Arrays.toString(mass));
    }
}
