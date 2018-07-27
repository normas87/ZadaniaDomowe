package Package;

public class Zwierze {

    //Stworzyć klasę Zwierzę, która będzie zawierała pola: (String)imię, (Integer)wiek.
    String imie;
    Integer wiek;

    // Klasa Zwierzę powinna posiadać konstruktor publiczny, który przyjmie wszystkie pola opisane powyżej.
    public Zwierze(String name, Integer age) {
        imie = name;
        wiek = age;
    }

    // Zadanie 2
    public void introduce() {
        System.out.println("Jestem zwierze");
    }

    }
