package odcinek8;

import java.util.Scanner;

public class OdwroconyWyraz {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz do odwrucenia");
        Scanner scan = new Scanner(System.in);
        String wyraz = scan.nextLine();
        int dlugosc = wyraz.length();

        System.out.println(wyraz + dlugosc);

        for (int i =dlugosc; i>0; i--){
            System.out.print(wyraz.charAt(i-1));
        }

    }
}
