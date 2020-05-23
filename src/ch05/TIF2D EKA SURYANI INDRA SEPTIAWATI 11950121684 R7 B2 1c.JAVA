package ch05;

import java.util.Scanner;
public class Euclidean {
    public static void main(String[] args) {
        int e, f, g;
        Scanner ras = new Scanner(System.in);
        System.out.print("e : ");
        e = ras.nextInt();

        System.out.print("f : ");
        f = ras.nextInt();

        g = e % f;
        while (g != 0){
            e = f;
            f = g;
            g = f % g;
        }

        System.out.println("FPB = " + f);
    }
}
