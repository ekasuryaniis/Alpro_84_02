package ch04;

import java.util.Arrays;

public class i {
    public static void main(String[] args) {
        // Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        //Menampilkan selisih angka-angka dengan angka setelahnya di dalam array

        for (int i = 1; i < arrayAngka.length; i++){
            System.out.print("Selisih dari " + arrayAngka[i-1] + " dan " + arrayAngka[i] + " = ");
            System.out.println(arrayAngka[i-1] - arrayAngka[i]);
        }
    }
}
