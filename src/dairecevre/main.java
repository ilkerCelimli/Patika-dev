package dairecevre;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yarı çapı giriniz");
        float yaricap = sc.nextFloat();
        System.out.println("Alan "+ (3.14* (2*yaricap)));
        System.out.println("Çevre "+6.14 * yaricap );
    }
}
