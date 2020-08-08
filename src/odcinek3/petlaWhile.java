package odcinek3;

import java.util.concurrent.TimeUnit;

public class petlaWhile {
    public static void main(String[] args) {
        int godziny=0;
        int bakterie = 1;

        while (bakterie <1000000){
            godziny=godziny+1;
            bakterie=bakterie*2;
            System.out.println("ilość bakteri równa się "+ bakterie + "  w godzinie " + godziny);
        }


    }


    }

