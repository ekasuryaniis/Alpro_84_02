package com.company;

public class SelectionSort {
    public static void main(String[] args) {
        int nilai [] = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        for (int i = 0 ; i<nilai.length-1;i++){
            int min = i;
            for (int x = 1+i ; x<nilai.length; x++){
                /*System.out.println(min+" "+x);*/
                if (nilai[min] > nilai[x]){
                    min = x;
                }
            }
            int z= nilai[min];
            nilai[min] = nilai [i];
            nilai[i] = z;
        }
        for (int i = 0 ; i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }
    }
}
