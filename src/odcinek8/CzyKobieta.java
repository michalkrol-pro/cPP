package odcinek8;

import java.util.Scanner;
import java.lang.String;

public class CzyKobieta {
    public static void main(String[] args) {
        System.out.println("Cześć, podaj prosze swoje imie: ");
        Scanner scan = new Scanner(System.in);
        String imie = scan.nextLine();
      int dlugosc = imie.length();

        System.out.println(imie.charAt(dlugosc-1));

        if (imie.charAt(dlugosc-1)=='a'){
            System.out.println("Jesteś Kobietą");
        } else System.out.println("Jesteś Facet");



    }
}



   //*     if (imie  =="a"){
       // System.out.println("Jezsteś Kobietą");
      //  } else System.out.println("Jesteś mężczyzną");