package recursiveasal;

public class Main {
    public static void main(String[] args) {
       boolean a =  asalMi(12);
        System.out.println(a);
    }

    public static boolean asalMi(int sayi) {
        return asalMi(sayi, sayi - 1);
    }

    private static boolean asalMi(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen - 1);
    }
}
