package odcinek2;

import java.util.Scanner;

public class ify {
    public static void main(String[] args) {
//        String X = "a";
//
//        if (X == "ay"){
//            System.out.println("ok");
//        } else {
//            System.out.println("nie");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pin");
        int Y = scan.nextInt();
        System.out.println(" podany pin to " + Y);

        if (Y == 0000){
            System.out.println("OK");
        } else {
            System.out.println("zle");
        }





    }

}
