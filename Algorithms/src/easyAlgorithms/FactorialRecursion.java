package easyAlgorithms;

public class FactorialRecursion {
    public static void main(String[] args) {

        System.out.println(fac(5));
    }
    public static int fac(int i){
        if(i == 0 ){
            return 1;
        }

        return i * fac(i-1);
    }
}
