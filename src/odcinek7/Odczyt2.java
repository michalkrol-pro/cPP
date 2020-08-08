package odcinek7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        boolean istnieje = file.exists();
        System.out.println(istnieje);

       String scieszka = file.getAbsolutePath();
        System.out.println(scieszka);

        Scanner scanner = new Scanner(file);

       /**
            String linia1 = scanner.nextLine();
        System.out.println(linia1);
            linia1 = scanner.nextLine();
        System.out.println(linia1);
            linia1 = scanner.nextLine();
        System.out.println(linia1);
        System.out.println("\\\\\\\\\\\\"); */


        while (scanner.hasNext()){
            String linia = scanner.nextLine();
            System.out.println(linia);
        }

    }
}
