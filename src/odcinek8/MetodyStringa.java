package odcinek8;

public class MetodyStringa {
    public static void main(String[] args) {
        String napis = "To jest przykłądowy obiekt klasy string";
        System.out.println(napis + " = Konkatenacja");
        System.out.println(napis.charAt(0)+"  -Wyświetle tylko pierwszy znak ");
        System.out.println(napis.equals("To jest przykłądowy obiekt klasy string")+ " sprawdzam czy napisy są sobie równe");
        System.out.println(napis.equalsIgnoreCase("TO JEST przykłądowy obiekt klasy string") + " nie wzraca uwagi na wielkosc liter");
        System.out.println(napis.startsWith("To" +" Sprawdza czy zadnie zaczyna się od szukanego parametru"));
        System.out.println(napis.endsWith("ing")+ " Sprawdza koniec stringa");
        System.out.println("Wycinamy tekst metodą substring "+napis.substring(20,31));
        System.out.println("długość stringa policzy lenght "+ napis.length());
        System.out.println("Stringi możemy łączyć plusem lub metodą concat".concat(napis));
        System.out.println("gdy chcemy zastąpić jeden znak innym użyjemy replace "+ napis.replace("T","O"));

    }
    }

