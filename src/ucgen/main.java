package ucgen;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kenar");
        a = sc.nextInt();
        System.out.println("Kenar");
        b = sc.nextInt();
        System.out.println("Kenar");
        c = sc.nextInt();
        int cevre = 2*((a+b+c)/2);
        int alan = cevre * (cevre-a) * (cevre-b) * (cevre-c);
        double sonuc = Math.sqrt(alan);
        System.out.println("Sonuc " +sonuc);

    }
}
