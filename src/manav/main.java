package manav;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Armut Kaç kilo: ");
        armut *= sc.nextFloat();
        System.out.println("Elma kaç kilo: ");
        elma*= sc.nextFloat();
        System.out.println("Domates Kaç kilo: ");
        domates *= sc.nextFloat();
        System.out.println("Muz kaç kilo: ");
        muz *= sc.nextFloat();
        System.out.println("Patlıcan kaç kilo: ");
        patlican *= sc.nextFloat();
        double toplam = armut+elma+domates+muz+patlican;
        System.out.println("Toplam: "+patlican);
    }
}
