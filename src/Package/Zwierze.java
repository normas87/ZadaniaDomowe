package Package;

class Zwierze {
    // Zadanie 1
    // - Stworzyć klasę Zwierzę, która będzie zawierała pola: (String)imię, (Integer)wiek.
    //TODO pola powinny być prywatne
    String imie;
    Integer wiek;

    // Klasa Zwierzę powinna posiadać konstruktor publiczny, który przyjmie wszystkie pola opisane powyżej.
    public void Zwierze(String name, Integer age) {
        this.imie = name;
        this.wiek = age;
    }

    // - w klasie Zwierze dodać metodę toString()
    @Override
    public String toString() {
        return "Zwierze{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    // Zadanie 2
    //Dodać do klasy Zwierzę metodę, która będzie wypisywać na ekran “Jestem Zwierzę”.
    public void introduce() {
        System.out.println("Jestem zwierze");
    }
}
