package taksimetre;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double km = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz");
        km = sc.nextDouble();
        double ucret = km*2.20;
        double sonuc = ucret+10 > 20 ? ucret : 20;
        System.out.println(sonuc);
    }
}
