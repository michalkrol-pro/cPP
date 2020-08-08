package odcinek5;

import java.util.Arrays;
import java.util.Scanner;

public class tablice {

    public static void main(String[] args) {
        System.out.println("Odcinek 5- tablice" +
                "Tab");
        Scanner scan = new Scanner(System.in);
        int[] tablica = new int[5];
        int suma =0;
        int srednia;

        for (int a = 0; a<5; a++){
            System.out.println("podaj "+(a+1)+" ocenę");
            tablica [a] = scan.nextInt();
            suma+=tablica[a];

        }
        srednia=suma/(tablica.length);
        System.out.println(Arrays.toString(tablica));
        System.out.println(suma);
        System.out.println(srednia);


    } }