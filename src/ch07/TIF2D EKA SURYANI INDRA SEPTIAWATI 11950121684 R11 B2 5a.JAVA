package com.company;

public class BlockSort {
    private BlockSort(int[] array) {
        int n = array.length;
        for (int e = 1;e<n;e++) {
            int key = array [e];
            int f=e-1;
            while ((f>-1)&&(array[f]>key)) {
                array[f+1] = array[f];
                f--;
            }
            array[f+1]=key;
        }
    }
    private int[] array;

    public static void main(String[] args) {
        int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        // mengurutkan array menggunakan block sort

        System.out.println("sebelum diurutkan dengan block sort");
        for (int f:array) {
            System.out.print(f+"");
        }
        System.out.println();
        new BlockSort(array);

        //sortir array menggunakan merge sort

        System.out.println("setelah menggunakan block sort");
        for(int f:array) {
            System.out.print(f+"");
        }
    }
}
