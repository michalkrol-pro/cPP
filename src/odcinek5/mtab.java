package odcinek5;

import java.util.Arrays;
import java.util.Scanner;

public class mtab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość wyświetlonych liczb");
        int n =scan.nextInt();
        int taba []= new int[200];
        for (int i=0; i<n; i++){
            taba[i]=i*(i+1);
        }
        System.out.println(Arrays.toString(taba));
        System.out.println("Podaj którą liczbe mam konkretnie wyswietlic");
        int t = scan.nextInt();
        System.out.println(taba[t]);
        System.out.println("Podaj którą liczbe mam konkretnie wyswietlic");
        int q = scan.nextInt();
        System.out.println(taba[q]);
        System.out.println("Podaj którą liczbe mam konkretnie wyswietlic");
        int w = scan.nextInt();
        System.out.println(taba[w]);

    }
}
