package ch08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class KnuthMorrisPratt {
    private final int[] failure;
    public KnuthMorrisPratt(String text, String pat)
    {
        /** pre construct failure array for a pattern **/
        failure = new int[pat.length()];
        fail(pat);
        /** find match **/
        int pos = posMatch(text, pat);
        if (pos == -1)
            System.out.println("\nTidak di Temukan Kecocokan");
        else
            System.out.println("\nKecocokan di Temukan Pada Index ke- "+ pos);
    }
    /** Failure function for a pattern **/
    private void fail(String pat)
    {
        int n = pat.length();
        failure[0] = -1;
        for (int f = 1; f < n; f++)
        {
            int e = failure[f - 1];
            while ((pat.charAt(f) != pat.charAt(e + 1)) && e >= 0)
                e = failure[e];
            if (pat.charAt(f) == pat.charAt(e + 1))
                failure[f] = e + 1;
            else
                failure[f] = -1;
        }
    }
    /** Function to find match for a pattern **/
    private int posMatch(String text, String pat){
        int e = 0, f = 0;
        int lens = text.length();
        int lenp = pat.length();
        while (e < lens && e < lenp)
        {
            if (text.charAt(e) == pat.charAt(f))
            {
                e++;
                f++;
            }
            else if (f == 0)
                e++;
            else
                f = failure[f - 1] + 1;
        }
        return ((f == lenp) ? (e - lenp) : -1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mencoba Knuth Morris Pratt\n");
        System.out.println("\nMasukkan Teks\n");
        String text = br.readLine();
        System.out.println("\nMasukkan Pola\n");
        String pattern = br.readLine();
        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, pattern);
    }
}
