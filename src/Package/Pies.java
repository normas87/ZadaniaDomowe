package Package;

// Stworzyć klasę Pies i Kot, które będą dziedziczyły po klasie Zwierze.
class Pies extends Zwierze {

    public Pies(String name, Integer age) {
        super(name, age);
    }

    @Override
    public introduce() {
        System.out.println("Jestem Psem");


    }
}
