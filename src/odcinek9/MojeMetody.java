package odcinek9;

import java.util.Scanner;

public class MojeMetody {

    public  static void temperatura(int x){
        if (x>=0){
            System.out.println("temperatura jest dodatnia");
        } else System.out.println("temp jest ujemna");
    }

    public static boolean isBigB(double x){
        return x>100;
    }

    public static double mile(double m){
        return m*0.621371192;
    }

    public  static void isBig(double x){
        if (x>100){
            System.out.println("Liczba jest większa od 100");
        } else System.out.println("liczba jest mniejsza od 100");
    }



    public static void main(String[] args) {
        System.out.println("W tym odcinku naucze się robić swoje włąsne metody :D podaj kilometry a przelicze na mile ");
        Scanner scan = new Scanner(System.in);
        double km = scan.nextDouble();
        System.out.println(mile(km));
        isBig(km);
        System.out.println(isBigB(km));
        System.out.println("podaj temperaturę");
        int t = scan.nextInt();
        temperatura(t);

    }
}
