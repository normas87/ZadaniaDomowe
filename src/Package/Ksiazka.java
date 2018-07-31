package Package;
import java.util.*;

public class Ksiazka {
    // Zadanie 8)
    // Tworzymy klasę Książka, która będzie zawierała pola tytuł, autor, liczba stron, wydawnictwo.

    String tytul, autor, wydawnictwo;
    int liczbaStron;


    public Ksiazka(String tytul, String autor, String wydawnictwo, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                ", liczbaStron=" + liczbaStron +
                '}';
    }
}







