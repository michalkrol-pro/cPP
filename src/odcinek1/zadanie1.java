package odcinek1;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {


        System.out.println("Hello World");

        // int iloscUczniow = 31;
        // int iloscCuksow = 67;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę uczniów w kalsie po czym wcisnij enter");
        int iloscUczniow = scan.nextInt();

        System.out.println("liczba cukierków kupiona przez mame? ");
        int iloscCuksow = scan.nextInt();



        int x = iloscCuksow % (iloscUczniow - 1);
        int y = iloscCuksow / iloscUczniow ;
        System.out.println("kazdy uczeń otrzyma po " + y +" cukierków");
        System.out.println("Jasiowi na wieczór zostanie " + x+" cukierków do zjedzenia ");
    }
}