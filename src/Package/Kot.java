package Package;

class Kot extends Zwierze {
    // Zadanie 1
    // Stworzyć klasę Pies i Kot, które będą dziedziczyły po klasie Zwierze.

    // Zadanie 2
    // Dodać w klasach Pies i Kot nadpisywanie metody(@Override), która została stworzona w klasie Zwierzę. Metoda dla Psa powinna wypisać na ekran “Jestem Pies” a dla Kota “Jestem Kot”
    @Override
    public void introduce() {
        System.out.println("Jestem kotem");
    }

    // Zadanie 3
    //Do klasy Pies dodać dodać pole rasa, które będzie zawierało Enum przygotowany dla kota.
    //TODO pola powinny być prywatne
    //TODO rasa kota powinna być ustawaiana przy tworzeniu obiektu tej klasy.
    //TODO brak konstruktora
    RasyKotow rasa = RasyKotow.DACHOWIEC;
}