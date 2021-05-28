package easyAlgorithms;

import java.util.Arrays;

public class StringBack {
    public static void main(String[] args) {
        String string =  "Привет это новая строка которую надо перевернуть";

        String[] massive = string.split(" ");
        int length = massive.length;
        System.out.println(length);
        String temp;

        for (int i = 0; i < length/2  ; i++) {
            temp = massive[i];
            massive[i] = massive[length -1 - i];
            massive[length -1 - i] = temp;
        }
        System.out.println(Arrays.toString(massive));

    }
}
