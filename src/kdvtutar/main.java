package kdvtutar;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para miktarı giriniz");
        float para = sc.nextFloat();
        float sonuc = para > 1000 ? (para *8)/100 : (para*18)/100;
        System.out.println(sonuc);
    }
}
