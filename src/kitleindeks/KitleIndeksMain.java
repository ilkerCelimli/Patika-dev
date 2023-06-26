package kitleindeks;

import java.util.Scanner;

public class KitleIndeksMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Boy (m)");
        double boy = sc.nextDouble();
        System.out.println("Ağırlık");
        double kilo = sc.nextDouble();
        double result = kilo/(boy*boy);
        System.out.printf(String.format("index %s",result));
    }

}
