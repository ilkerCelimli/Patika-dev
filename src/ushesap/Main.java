package ushesap;

public class Main {

    public static void main(String[] args) {
      int a = usHesap(5,3);
        System.out.println(a);
    }

    public static int usHesap(int a, int b){
        if(b == 1){
            return a;
        }
        if(b == 0){
            return 1;
        }
        return a*(usHesap(a,b-1));

    }

}
