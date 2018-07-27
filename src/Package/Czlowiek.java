package Package;

public class Czlowiek {

    //Zadanie 4
    String imie, nazwisko;
    Zwierze zwierze;
    DaneAdresowe daneAdresowe;

    public Czlowiek(String name, String surname) {
        name = imie;
        surname = nazwisko;
    }

    public void przedstawSie() {
        System.out.println("Cześć, nazywam się " + imie + nazwisko);
    }

    public Zwierze getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }





    }



