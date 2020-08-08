package odcinek6;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Hej");

            for (;;){
            float x;
            int wybor;
            System.out.println("Podaj pierwszą liczbę");
            x = scan.nextFloat();
            System.out.println("Podaj drugą liczbę");
            float y = scan.nextFloat();
            System.out.println("////////////////////");
            System.out.println("jaką operacje matematyczną mamy przeprowadzić na podanych liczbach");
            System.out.println("1 dodwanie ");
            System.out.println("2 odejmowanie");
            System.out.println("3 mnożenie ");
            System.out.println("4 dzielenie");
            System.out.println("podaj cyfrę odpowiadającą danej operacji");
            int z = scan.nextInt();

            switch (z) {
                case 1:
                    System.out.println("Suma = " + (x + y));
                    break;
                case 2:
                    System.out.println("różnica = " + (x - y));
                    break;
                case 3:
                    System.out.println("iloczyn = " + (x * y));
                    break;
                case 4:
                    if (y == 0) {
                        System.out.println("nie dzielimy przez zero");
                    } else {
                        System.out.println("iloraz = " + (x / y));
                    }
                    break;
                default:
                    System.out.println("nie ma takiej opcji w menu");
            }
            }


    }
}
