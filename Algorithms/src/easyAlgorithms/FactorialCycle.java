package easyAlgorithms;

import java.util.Scanner;

public class FactorialCycle {
    public static void main(String[] args) {
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo:");

        while(scanner.hasNext()){
            j = scanner.nextInt();
            int res = 1;

            for (int i = 1; i <= j; i++) {
                if (j == 0){
                    res = 1;
                }
                res *=i;

            }
            System.out.println(res);

            System.out.println("Vvedite chislo:");
        }


            // АЛГОРИТМ ОБРАТНОГО ПОИСКА

//        int j = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vvedite chislo:");
//
//        while(scanner.hasNext()){
//            j = scanner.nextInt();
//            int res = 1;
//            int itog= 1;
//
//            for (int i = 1; i <= j; i++) {
//                if (j == 0){
//                    res = 1;
//                }
//                res *=i;
//                if (res==j){
//                    itog = i;
//                    break;
//                }
//
//            }
//            System.out.println(itog);
//            System.out.println("Vvedite chislo:");
//        }
    }
}
