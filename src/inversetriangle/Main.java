package inversetriangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int number = sc.nextInt();
        int i = number, j;
        while (i > 0) {
            j = 0;
            while (j++ < number - i) {
                System.out.print(" ");
            }
            j = 0;
            while (j++ < (i * 2) - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}
