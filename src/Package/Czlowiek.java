package Package;

public class Czlowiek {

    //Zadanie 4
    String imie, nazwisko;
    Zwierze zwierze;
    DaneAdresowe daneAdresowe;

    public Czlowiek(String name, String surname) {
        imie = name;
        nazwisko = surname;
    }

   //Zadanie 5)
    public void przedstawSie() {
        System.out.println("Cześć, nazywam się " + imie +" "+ nazwisko);
    }
    public void przedstawSie(String loveAnimals){
        System.out.println("Cześć, nazywam się " + imie +" "+ nazwisko + loveAnimals);
    }

    public Zwierze getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }


}



