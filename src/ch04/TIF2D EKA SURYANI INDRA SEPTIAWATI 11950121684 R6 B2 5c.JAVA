package ch04;

import java.util.Scanner;

public class c {

    private static int[] bilangan;
    public static void main(String[] args) {
        // Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}
        // Menampilkan angka-angka ganjil di dalam array
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("");
        System.out.print("Bilangan Ganjil : ");
        for(int i=0; i<bilangan.length; i++){
            //Jika data array bilangan tidak habis dibagi 2 = 0
            if (bilangan [i] % 2!= 0){
                System.out.print(bilangan[i] +"" );

            }
        }
        System.out.println("");
    }
}
