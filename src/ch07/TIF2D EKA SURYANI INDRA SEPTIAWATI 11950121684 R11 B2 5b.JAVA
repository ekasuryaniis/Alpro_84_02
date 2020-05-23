package ch07;

public class CocktailShakerSort {
    private CocktailShakerSort(int[] array) {
        int n = array.length;
        for (int f = 1;f<n;f++) {
            int key = array [f];
            int e=f-1;
            while ((e>-1)&&(array[e]>key)){
                array[e+1] = array[e];
                e--;
            }
            array[e+1]=key;
        }
    }
    private int[] array;

    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        //mengurutkan array menggunakan Cocktail Shaker Sort

        System.out.println("sebelum cocktail shaker sort");
        for (int e:array){
            System.out.print(e+" ");
        }
        System.out.println();
        new CocktailShakerSort(array);
        //Piih array Menggunakan merge sort

        System.out.println("setelah dipilih cocktail shaker sort");
        for(int e:array){
            System.out.print(e+" ");
        }
    }
}
