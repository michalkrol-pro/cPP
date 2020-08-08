package odcinek3;

import java.util.Scanner;

public class petlaFor2 {
    public static void main(String[] args) {
        int liczba;
        String imie;
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imie");
        imie = scan.nextLine();
        System.out.println("podaj liczbę ile razy wypisac to imie");
        liczba = scan.nextInt();

        for(int i=1; i<=liczba; i++){
            System.out.println(i +" " +imie);
        }
    }
}
