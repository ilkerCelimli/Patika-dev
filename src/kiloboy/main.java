package kiloboy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        float boy = sc.nextFloat();
        System.out.print("\nLütfen kilonuzu giriniz: ");
        float kilo = sc.nextFloat();
        float sonuc = kilo / boy*boy;
        System.out.println("Vücut kitle endeksiniz: "+ sonuc);
    }
}
