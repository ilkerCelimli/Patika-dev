package artikyil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        int year = sc.nextInt();
        String y = String.valueOf(year);
        if(y.charAt(2) == '0' && y.charAt(3) == '0' && year%400 != 0){
            System.out.println("Artık yıl değil");
            return;
        }
        if(year%4 == 0){
            System.out.println("Artık yıl");
            return;
        }
        System.out.println("Artık yıl değil");
    }
}
