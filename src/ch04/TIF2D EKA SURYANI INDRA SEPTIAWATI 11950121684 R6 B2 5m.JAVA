package ch04;

import java.util.Arrays;

public class m {
    public static void main(String[] args) {
        // Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // Menghitung jumlah angka-angka selisih yang ditampilkan pada poin (e) di atas

        int selisih, hasil = 0;

        System.out.print("Hasil penjumlahan angka selisih pada poin e adalah = ");
        for (int e = 1; e < arrayAngka.length; e++){
            selisih = arrayAngka[e-1] - arrayAngka[e];

            hasil += selisih;
        }
        System.out.println(hasil);
    }
}
