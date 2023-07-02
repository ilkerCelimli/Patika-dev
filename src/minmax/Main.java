package minmax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç sayı giriceksiniz: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Sayı giriniz");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[1];
        for(int i = 0;i<size;i++){
            if(min>array[i]) min = array[i];
            if(max<array[i]) max = array[i];
        }
        System.out.println(String.format("Min %s , Max %s",min,max));
    }
}
