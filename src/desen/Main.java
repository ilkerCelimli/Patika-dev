package desen;

public class Main {

    public static void main(String[] args) {
        recursiveIslem(15);
    }
    public static void recursiveIslem(int sayi) {
        if (sayi <= 0) {
            System.out.println(sayi);
            return;
        }

        System.out.println(sayi);

        recursiveIslem(sayi - 5);

        System.out.println(sayi);
    }
}
