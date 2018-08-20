package company.com;

class Pies extends Zwierze {
    // Zadanie 1
    // Stworzyć klasę Pies i Kot, które będą dziedziczyły po klasie Zwierze.

    // Zadanie 2
    // Dodać w klasach Pies i Kot nadpisywanie metody(@Override), która została stworzona w klasie Zwierzę. Metoda dla Psa powinna wypisać na ekran “Jestem Pies” a dla Kota “Jestem Kot”
    @Override
    public void introduce() {
        System.out.println("Jestem psem");
    }

    // Zadanie 3
    //Do klasy Pies dodać dodać pole rasa, które będzie zawierało Enum przygotowany dla psa.

    //TODO pola powinny być prywatne
    private RasyPsow rasa;
    public RasyPsow getRasa() {return rasa; }
    public void setRasa(RasyPsow rasa) {this.rasa = rasa;}

    //TODO brak konstruktora
    Pies (RasyPsow rasa){};

    //TODO rasa pas powinna być ustawaiana przy tworzeniu obiektu tej klasy.
    //  jest w main 11 linijka
}
