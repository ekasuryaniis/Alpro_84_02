package ch08;

public class LongestCommonSubstringProblem {
    static String X, Y;
    // Returns length of function for longest common
    // substring of X[0..m-1] and Y[0..n-1]
    static int lcs(int i, int j, int count) {

        if (e == 0 || f == 0) {
            return count;
        }
        if (X.charAt(e - 1) == Y.charAt(f - 1)) {
            count = lcs(e - 1, f - 1, count + 1);
        }
        count = Math.max(count, Math.max(lcs(e, f - 1, 0), lcs(e - 1, f, 0)));
        return count;
    }
    // Driver code
    public static void main(String[] args){
        int n, m;
        X = "EKA";
        Y = "SURYANI";

        n = X.length();
        m = Y.length();
        System.out.println(lcs(n, m, 0));
    }
}
