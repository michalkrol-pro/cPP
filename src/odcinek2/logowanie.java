package odcinek2;

import java.util.Scanner;

public class logowanie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("podaj login");
        String login = scan.next();
        System.out.println("podaj hasło");
        String haslo = scan.next();

     /**String login = "a";
      String haslo = "q"; */

        if ((login.equals("admin")) && (haslo.equals("1234"))) {
            System.out.println("Udało sie zalogować");
        } else {
            System.out.println("Logowanie nie powiodło się");
        }
    }

}
