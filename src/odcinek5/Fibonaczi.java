package odcinek5;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonaczi {
    public static void main(String[] args) {
        System.out.println("Ciąg finnaciego");
        Scanner scan = new Scanner(System.in);
        int[] tabF = new int[100000];
        int n;

        tabF[0]=1;
        tabF[1]=1;
        System.out.println("Podaj ilość liczb jaką mamy wpisac");
        n = scan.nextInt();

        for (int i=2;  i<n; i++){
            tabF[i]= tabF[i-1]+tabF[i-2];
        }
        for (int i=0; i<n; i++){
            System.out.println("Liczba F numer "+(i+1)+" równa się:"+tabF[i]);
        }

    }
}
