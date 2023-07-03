package transpoz;

public class Main {public static void main(String[] args) {
    int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    System.out.println("Matris:");
    matrisYazdir(matris);

    int[][] transpozMatris = transpozBul(matris);

    System.out.println("\nTranspoz Matris:");
    matrisYazdir(transpozMatris);
}

    public static int[][] transpozBul(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        return transpozMatris;
    }

    public static void matrisYazdir(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
