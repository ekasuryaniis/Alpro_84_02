package com.company;

public class ega {
    public static void main(String[] args) {
        int limit =44444444; // Batas maksimum bil. prima yang dicari
        boolean[] bil_asal = new boolean[limit];
        for (int i = 0; i < limit; i++) {
            bil_asal[i] = true;
        }
        bil_asal[0] = false; // bilangan 0 bukan bilangan prima
        bil_asal[1] = false; // bilangan 1 bukan bilangan prima

        // Penerapan algoritma Sieve of Erathosthenes
        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (bil_asal[i]) {
                for (int j = i * i; j < limit; j = j + i) {
                    bil_asal[j] = false;
                }
            }
        }

        
    }
}
