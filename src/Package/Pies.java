package Package;

class Pies extends Zwierze {
// Stworzyć klasę Pies i Kot, które będą dziedziczyły po klasie Zwierze.

    public Pies(String name, Integer age) {
        super(name, age);
    }


    // Zadanie 2
    @Override
    public void introduce() {
        System.out.println("Jestem psem");
    }

    // Zadanie 3
    RasyPsow rasa = RasyPsow.DOBERMAN;
}
