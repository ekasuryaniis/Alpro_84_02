import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class b {


    public static void main(String[] args) {
Scanner scanner;
        scanner = new Scanner(System.in);
        //perhatikan Array berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

       int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        //mencari sebuah angka didalam array
        System.out.print("Masukkan angka yang ingin dicari");

        int input = scanner.nextInt();

        Arrays.sort(arrayAngka);
        System.out.println(Arrays.toString(arrayAngka));
        int hasil = binarySearch(arrayAngka,input);

       if (hasil < 0) {
           System.out.println("MAAF,NILAI TIDAK DITEMUKAN");
       } else {
           System.out.println("Array dengan nilai " + input +  "berada pada indeks ke- "+ hasil);
       }
   }
}
