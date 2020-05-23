package ch09;

import java.util.Arrays;
public class SieveOfSundaram {
    static int SieveOfSundaram(int n) {
        int nNew = (n - 2) / 2;
        boolean marked[] = new boolean[nNew + 1];
        Arrays.fill(marked, false);
        for (int e = 1; e <= nNew; e++)
            for (int f = e; (e + f + 2 * e * f) <= nNew; f++)
                marked[i + j + 2 * i * j] = true;
        //2 adalah bilangan prima
        if (n > 2)
            System.out.print(2 + " ");
        for (int e = 1; e <= nNew; e++)
            if (marked[e] == false)
                System.out.print(2 * e + 1 + " ");
        return -1;
    }
    // Driver code
    public static void main(String[] args) {
        int n = 20;
        SieveOfSundaram(n);
    }
}
