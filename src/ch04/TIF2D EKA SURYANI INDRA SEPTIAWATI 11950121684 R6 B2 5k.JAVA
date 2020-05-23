package ch04;

import java.util.Arrays;

public class k {
    public static void main(String[] args) {
        // Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // Menampilkan angka-angka setelahnya bernilai bernilai besar

        System.out.println("Menampilkan Angka-Angka yang setelahnya bernilai lebih besar");
        System.out.println("-------------------------------");
        for (int e = 1; e < arrayAngka.length; e++){
            if ( arrayAngka[e] > arrayAngka[e-1]){
                System.out.println(arrayAngka[e-1]);
            }
        }
    }
}
