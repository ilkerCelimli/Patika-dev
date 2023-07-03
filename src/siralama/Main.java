package siralama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizi boyutu: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Sayı giriniz");
            array[i] = sc.nextInt();
        }
        array = bubbleSort(array);
        diziYazdir(array);

    }
    public static int[] bubbleSort(int[] dizi) {
        int n = dizi.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    // Swap işlemi
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
        return dizi;
    }

    public static void diziYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
