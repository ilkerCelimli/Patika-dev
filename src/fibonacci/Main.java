package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int size = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        for(int i = 0;i<size;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
