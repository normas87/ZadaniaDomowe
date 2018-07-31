package Package;

public class Czlowiek {

    //Zadanie 4
    //Stworzyć klasę Człowiek, która będzie zawierała pola, imię, nazwisko
    String imie, nazwisko;


    //Klasa człowiek powinna zawierać konstruktor publiczny, który będzie przyjmował wszystkie pola jako argumenty
    public Czlowiek(String name, String surname) {
        imie = name;
        this.nazwisko = surname;    // można z this, czy nawet trzeba z this?

    }

    //Do klasy Człowiek dodać dwa kolejne pola:
    // - pole zwierzę, które będzie typu Zwierzę
    // - pole dane adresowe, które będzie typu Dane Adresowe

    Zwierze zwierze;                    //wiem że w dobrej praktyce wszystkie pola powinny być u góry ale dla czytelności czy wszystkie polecenia zrobiłem układam kod według klejności jak idą polecenia w zadaniu
    DaneAdresowe daneAdresowe;

    public Zwierze getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }


    //Zadanie 5)
    //Do klasy Człowiek dodać nową metodę która będzie wypisywać : “ Cześć nazywam się [tutaj powinniśmy wypisać imię i nazwisko ]”

    void przedstawSie() {
        System.out.println("Cześć, nazywam się " + imie + " " + nazwisko);
    }

    // Przeciążyć powyższą metodę, która będzie dodawała dodatkowy tekst, który będzie
    // przyjmowany jako parametr metody. Przykład w parametrze metody przeciążonej
    // podamy “Kocham zwierzęta”. Tekst, który zostanie wyświetlony to : “ Cześć
    // nazywam się [tutaj powinniśmy wypisać imię i nazwisko ]. Kocham zwierzęta “

    void przedstawSie(String loveAnimals) {
        System.out.println("Cześć, nazywam się " + imie + " " + nazwisko + loveAnimals);
    }
}





