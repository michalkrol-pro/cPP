package odcinek7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Zapis2 {
    public static void main(String[] args) throws IOException {
        File file = new File("plik2.txt");
        boolean sukses = file.createNewFile();
        System.out.println("czy udało sie utworzyc plik?: "+ sukses);
        PrintWriter pisz = new PrintWriter(file);
        pisz.println("Pisze do pliku z programu");
        pisz.println("zawsze jak konczysz to pamiętaj aby zakończyć strumień close");
        pisz.close();

    }
}
