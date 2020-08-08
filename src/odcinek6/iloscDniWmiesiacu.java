package odcinek6;

import java.util.Scanner;

public class iloscDniWmiesiacu {
    public static void main(String[] args) {
        System.out.println("Cześć");
        Scanner scan = new Scanner(System.in);

        // petla nieskonczona//
        while (true){
        System.out.println("Podaj numer miesiąca a ja określe ile ma dni");
        int q = scan.nextInt();

        switch (q) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("ten miesiąc ma 31 dni");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("ten miesiac ma 30 dni");
                break;
            case 2:
                System.out.println("podaj rok ");
                int w = scan.nextInt();

                if (((w % 4 == 0) && (w % 100 != 0)) || (w % 400 == 0)) {
                    System.out.println("jest to rok przestępny wiec LUTY ma 29 dni");
                } else System.out.println("28");
            default:
                System.out.println("do tej zmiennej nie przypisano żadnego miesiąca");
        }
        }
    }
}
