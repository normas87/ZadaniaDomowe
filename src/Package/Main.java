package Package;

public class Main {
    public static void main(String[] args) {

//​ Klasy i dziedziczenie
// Zadanie 1

        Pies wladek = new Pies("Władysław", 32);
        System.out.println(wladek);
        // Zadanie 2
        wladek.introduce();

        Kot stefcio = new Kot("Stefan", 53);
        System.out.println(stefcio);
        // Zadanie 2
        stefcio.introduce();


        Czlowiek wiesiek = new Czlowiek("Wiesiek", "Kowalski");
        wiesiek.setZwierze(wladek);

        System.out.println(wiesiek);


    }
}