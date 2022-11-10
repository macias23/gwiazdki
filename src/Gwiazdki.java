import java.io.*;
import java.util.Arrays;

public class Gwiazdki {
    public static void drukujGwiazdki(int N) {
        /*Ze wzoru na medianę i na ciąg artmetyczny środkowa gwiazdka ma indeks N.
        wzór na liczbę gwiazdek w rzędzie a=2n-1*/
        String[] gwiazdki=new String[2*N-1];
        Arrays.fill(gwiazdki, " ");
        gwiazdki[N-1]="*";
        for (int i=0; i<N; i++){
        gwiazdki[N-1+i]="*";
        gwiazdki[N-1-i]="*";
        String polaczoneGwiazdki = String.join(" ", gwiazdki);
        System.out.println(polaczoneGwiazdki);

        }
    }
    public static void main(String[] args) {
        int dane= Integer.parseInt(args[0]);
        drukujGwiazdki(dane);
    }
}