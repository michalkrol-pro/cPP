package odcinek4;

import java.util.Random;
import java.util.Scanner;

public class random2 {
    public static void main(String[] args) {
        System.out.println("cześć, JA wylosuję, a TY zgadnij jaka to liczba      //0...100/");
        Random generator = new Random();
        int kompa = (1+(generator.nextInt(100)));
        int moja;
        int proba=0;
        Scanner scan = new Scanner(System.in);

        do{ proba++;
            System.out.println("zgadnij liczbę "+ " to Twoja "+proba+" próba");
            moja = scan.nextInt();

            if (kompa == moja){
                System.out.println("Brawo!!  wygrałeś w "+proba+" próbie");
            } else if (kompa>moja){
                System.out.println("podaj większą ");
            } else if (kompa<moja){
                System.out.println("podaj mniejsze ");
            }
        } while (kompa!=moja);
    }
}
