package ch04;

public class d {

    private static int index;


    public static void main(String[] args) {
        // Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

       // Menampilkan angka-angka kelipatan 3 di dalam array

        int i =0;
        System.out.println("Angka Kelipatan 3 dalam Array");
        System.out.println("-----------------------------");
        do {
            if (arrayAngka[i] %3 == 0){
                System.out.println(arrayAngka[index]);
            }

            index++;
        } while(i < arrayAngka.length);

    }
}

