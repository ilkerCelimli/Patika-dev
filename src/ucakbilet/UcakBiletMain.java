package ucakbilet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UcakBiletMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz");
        double mesafe= sc.nextDouble();
        if(mesafe <0) System.out.println("Yanlış bilgi");
        System.out.println("Yaşı giriniz");
        int yas = sc.nextInt();
        if(yas <0) System.out.println("Yanlış bilgi");
        System.out.println("Gidiş -> 1 gidiş-dönüş -> 2");
        int gidis = sc.nextInt();
        if(gidis != 1 && gidis != 2) {
            System.out.println("Yanlış giriş");
        }
        double res = mesafe*0.10;
        if(yas<12) res = mesafe/2;
        if(yas>12 && yas<24) {
            res = (mesafe*10)/100;
        }
        if(yas>65) res = (mesafe*30)/100;
        if(gidis == 2){
            res = res-((mesafe*20)/100);
        }

        System.out.println("Bilet fiyatı :" + res);
    }

}
