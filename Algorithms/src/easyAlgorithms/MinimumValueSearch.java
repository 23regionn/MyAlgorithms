package easyAlgorithms;

public class MinimumValueSearch {
    public static void main(String[] args) {
        int[] massive = new int[]{99, 55, 88, 35, 96, 42, 75, 64, 21, 7};

        int minValue = massive[0];
        int minIndex = 0;

        for(int  i =1; i< massive.length; i++){
            if(massive[i] < minValue){
                minValue = massive[i];
                minIndex = i;
            }
        }
        System.out.println("minimalValue = " + minValue);
        System.out.println("minimalIndex = " + minIndex);
    }
}
