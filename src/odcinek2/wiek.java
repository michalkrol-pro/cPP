package odcinek2;

import java.util.Scanner;

public class wiek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ile masz lat? ");
        int wiek = scan.nextInt();
        System.out.println("Twój wiek to : " + wiek + " lat");

        if (wiek<18){
            System.out.println("Nie jesteś pełnoletni i nie możesz kandydować na prezydenta");
        } else if ((wiek >= 18) && (wiek < 35)){
            System.out.println("jesteś pełnoletni ale nie możesz kandydować na prezydenta ");
        } else {
            System.out.println("Możesz kandydować na prezydenta");
        }

    }
}
