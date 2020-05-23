package ch04;

 import java.util.Arrays;

    public class j {
        public static void main(String[] args) {
            // 1. Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

            int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


            //  Tampilkan selisih angka-angka genap dengan angka setelahnya yang genap pula di dalam array

            int e = 1;

            do{
                if (arrayAngka[e] %2 == 0 && arrayAngka[e-1] %2 == 0){
                    System.out.print("Hasil dari " + arrayAngka[e-1] + " dan " + arrayAngka[e] + " = ");
                    System.out.println(arrayAngka[e-1] + arrayAngka[e] + " ");
                }
                e++;
            } while(e < arrayAngka.length);
        }
}
