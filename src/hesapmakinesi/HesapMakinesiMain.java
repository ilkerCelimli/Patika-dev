package hesapmakinesi;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Scanner;

public class HesapMakinesiMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num1;
        int num2;
        String islem = "";

            System.out.println("Num-1");
            num1 = sc.nextInt();
            System.out.println("num-2");
            num2 = sc.nextInt();
            System.out.println("işlem");
            islem = sc.next();
            result = sonuc(num1,num2,islem);
            System.out.println(String.format("Sonuç %s",result));
    }

    public static int sonuc(int a,int b,String islem) {
        switch (islem) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a + b;
            case "*":
                return a * b;
            default: return 0;
        }
    }
}
