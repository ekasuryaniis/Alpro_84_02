package ch04;

public class n {
    public static void main(String[] args) {
        // Perhatikan Array Berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        // Menampilkan jumlah angka-angka di dalam array tersebut di atas dengan seluruh angka-angka sebelumnya

        int hasil = 0;

        for (int e = 0; e < arrayAngka.length; e++){
            System.out.print("Hasil jumlah " + arrayAngka[e] + " dengan seluruh angka sebelumnya = ");
            System.out.println(arrayAngka[e] + hasil);
            hasil = hasil + arrayAngka[e];
        }
    }
}
