package searchAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{99, 55, 88, 35, 96, 42, 75, 64, 25, 75, 84, 35, 62, 11, 89, 53, 96, 12, 33, 28};
        System.out.println(searchLinear(array, 96));


    }
    private static int searchLinear(int[] arr, int element){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
