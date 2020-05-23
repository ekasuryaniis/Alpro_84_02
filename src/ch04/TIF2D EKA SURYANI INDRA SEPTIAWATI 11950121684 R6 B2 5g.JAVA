package ch04;

import java.util.Arrays;

public class g {
    public static void main(String[] args) {
        // Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


       //Menampilkan angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5 di dalam array

        System.out.println("Angka Kelipatan 5 dan Sebelumnya juga Kelipatan 5");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < arrayAngka.length; i++){
            if (arrayAngka[i] %5 == 0 && arrayAngka[i-1] %5 == 0){
                System.out.println(arrayAngka[i]);
            }
        }
    }
}
