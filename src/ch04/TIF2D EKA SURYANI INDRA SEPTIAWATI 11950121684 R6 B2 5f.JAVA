package ch04;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        //Menampilkan angka-angka ganjil yang diapit oleh angka genap didalam array

        System.out.println("Angka Ganjil di apit Angka Genap");
        System.out.println("--------------------------------");

        for (int i = 0; i < arrayAngka.length-1; i++){
            if (arrayAngka[i] %2 != 0){
                System.out.println(arrayAngka[i]);
            }
        }

    }
}
