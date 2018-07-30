package Package;

public class Main {
    public static void main(String[] args) {

//​ Klasy i dziedziczenie
// Zadanie 1
        //W metodzie main stworzyć jeden obiekt klasy Pies i jeden obiekt klasy Kot i wypisać je na ekran
        Pies wladek = new Pies();
        wladek.Zwierze("Władek", 43);
        System.out.println("Pies: " + wladek);

        Kot stefcio = new Kot();
        stefcio.Zwierze("Stefcio", 32);
        System.out.println("Kot: " + stefcio);

// Zadanie 2
        // W metodzie main wywołać dla Psa i Kota tą metodę, którą stworzyliśmy
        wladek.introduce();
        stefcio.introduce();



        Czlowiek wiesiek = new Czlowiek("Wiesiek", "Kowalski");
        wiesiek.setZwierze(wladek);

        wiesiek.przedstawSie();
        System.out.println("====================");
        wiesiek.przedstawSie(" i kocham zwierzęta");


    }
}