package ch05;

public class LongestCommonSubsequence {
    int lcs( char[] E, char[] F, int m, int n )
    {
        if (m == 0 || n == 0)
            return 0;
        if (E[m-1] == F[n-1])
            return 1 + lcs(E, F, m-1, n-1);
        else
            return max(lcs(E, F, m, n-1), lcs(E, F, m-1, n));
    }
    int max(int e, int f)
    {
        return (e > f)? e : f;
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "EKA";
        String s2 = "SURYANI";
        char[] E=s1.toCharArray();
        char[] F=s2.toCharArray();
        int m = E.length;
        int n = F.length;
        System.out.println("Panjangnya adalah" + " " +
                lcs.lcs( E, F, m, n ) );
    }
}
