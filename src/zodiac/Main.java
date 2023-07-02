package zodiac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz");
        int birtday = sc.nextInt();
        int result = birtday %12;
        if(result == 0){
            System.out.println("Maymun");
            return;
        }
        if(result == 1){
            System.out.println("Horoz");
            return;
        }
        if(result == 3){
            System.out.println("Köpek");
            return;
        }
        if(result == 4){
            System.out.println("Fare");
            return;
        }
        if(result == 5){
            System.out.println("Öküz");
            return;
        }
        if(result == 6){
            System.out.println("Kaplan");
            return;
        }
        if(result == 7){
            System.out.println("Tavşan");
            return;
        }
        if(result == 8){
            System.out.println("Ejderha");
            return;
        }
        if(result == 9){
            System.out.println("Yılan");
            return;
        }
        if(result == 10){
            System.out.println("At");
            return;
        }
        if(result == 11){
            System.out.println("Koyun");
        }

    }
}
