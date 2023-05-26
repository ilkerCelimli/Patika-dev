package nothesap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat, fiz, kim, muz, tr, tarih = 0;
        System.out.println("Mat notu");
        mat = sc.nextInt();
        System.out.println("Fizik notu");
        fiz = sc.nextInt();
        System.out.println("kimya notu");
        kim = sc.nextInt();
        System.out.println("Türkçe notu");
        tr = sc.nextInt();
        System.out.println("Tarih notu");
        tarih = sc.nextInt();
        System.out.println("Müzik Notu");
        muz = sc.nextInt();
        String sonuc = mat + fiz + kim + muz + tr + tarih / 6 > 60 ? "Geçtiniz" : "Geçemediniz";
        System.out.println(sonuc);
    }
}