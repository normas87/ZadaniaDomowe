package Package;

class Kot extends Zwierze {
// Stworzyć klasę Pies i Kot, które będą dziedziczyły po klasie Zwierze.

    public Kot(String name, Integer age) {
        super(name, age);
    }

    // Zadanie 2
    @Override
    public void introduce() {
        System.out.println("Jestem kotem");
    }

    // Zadanie 3
   RasyKotow rasa = RasyKotow.DACHOWIEC;
 //   RasyKotow rasa;

}