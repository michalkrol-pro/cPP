package odcinek2;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj w naszym banku");
        System.out.println("podaj PIN");
        String PIN = scan.nextLine();
        System.out.println("Pin został zapisany");
        System.out.println(PIN);


        if (PIN.equals("0000")) {
            System.out.println("OK, pin poprawny, zapraszamy");
        } else {
            System.out.println("NIE poprawny pin, odrzucono");
        }
    }
}