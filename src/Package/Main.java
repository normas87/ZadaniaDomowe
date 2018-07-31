package Package;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//​ Klasy i dziedziczenie
// Zadanie 1
        //W metodzie main stworzyć jeden obiekt klasy Pies i jeden obiekt klasy Kot i wypisać je na ekran
        Pies wladek = new Pies();
        wladek.Zwierze("Władek", 43);
        System.out.println("Pies: " + wladek);

        Kot stefcio = new Kot();
        stefcio.Zwierze("Stefcio", 32);
        System.out.println("Kot: " + stefcio);

// Zadanie 2
        // W metodzie main wywołać dla Psa i Kota tą metodę, którą stworzyliśmy
        wladek.introduce();
        stefcio.introduce();


//Zadanie 4
        //W metodzie main, stworzyć dwa obiekty klasy Człowiek:
        Czlowiek wiesiek = new Czlowiek("Wiesiek", "Kowalski");

        //Dla jednego obiektu w polu zwierzę przypisać obiekt klasy Pies(który został stworzony we wcześniejszych zadaniach)
        wiesiek.setZwierze(wladek);

        //Dla drugiego obiektu w polu zwierzę przypisać obiekt klasy Kot(który został stworzony we wcześniejszych zadaniach)
        Czlowiek romek = new Czlowiek("Roman", "Nowak");
        romek.setZwierze(stefcio);


        //Zadanie 5
        // W metodzie main wywołać:
        // - metodę w wersji “podstawowej” bez argumentów
        wiesiek.przedstawSie();

        //metodę w wersji “rozszerzonej” z argumentem np. “Kocham zwierzęta”
        wiesiek.przedstawSie(" i kocham zwierzęta");

//Zadanie 6
        //Stworzyć listę, która będzie zawierała elementy typu String
        List<String> lista_01 = new ArrayList<String>();

        //Do listy dodajmy 10 elementy wykorzystując metodę add()
        lista_01.add("element listy 01");
        lista_01.add("element listy 02");
        lista_01.add("element listy 03");
        lista_01.add("element listy 04");
        lista_01.add("element listy 05");
        lista_01.add("element listy 06");
        lista_01.add("element listy 07");
        lista_01.add("element listy 08");
        lista_01.add("element listy 09");
        lista_01.add("element listy 10");

        // Wyświetlamy listę za pomocą zwykłej pętli for
        for (int i = 0; i < lista_01.size(); i++) {
            System.out.println(lista_01.get(i));
        }

        System.out.println("====================");

        // Wyświetlamy listę za pomocą pętli foreach
        for (String j : lista_01) {
            System.out.println(j);
        }
        System.out.println("====================");

//Zadanie 7

        List<Integer> lista_02 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        // Wyświetlamy wszystkie elementy listy za pomocą foreach
        for (int k : lista_02) {
            System.out.println(k);
        }

        //Wyświetlamy wielkość listy
        System.out.println("Wielkość listy to: " + lista_02.size());

        System.out.println("====================");
        //Usuwamy pierwszy element listy:
        lista_02.remove(0);
        //Usuwamy ostatni element listy:
        lista_02.remove(lista_02.size() - 1);
        //Wyświetlamy wielkośc listy
        System.out.println("Wielkość listy to: " + lista_02.size());


// Zadanie 8
        Ksiazka book_01 = new Ksiazka("Tytuł_01", "Wiesiek", "IPN", 345);
        Ksiazka book_02 = new Ksiazka("Tytuł_02", "Grażyna", "IPN", 205);
        Ksiazka book_03 = new Ksiazka("Tytuł_03", "Janusz", "IPN", 103);
        Ksiazka book_04 = new Ksiazka("Tytuł_04", "Roman", "IPN", 45);
        Ksiazka book_05 = new Ksiazka("Tytuł_05", "Zdzichu", "IPN", 523);
        Ksiazka book_06 = new Ksiazka("Tytuł_06", "Heniek", "IPN", 800);
        Ksiazka book_07 = new Ksiazka("Tytuł_07", "Karina", "IPN", 75);
        Ksiazka book_08 = new Ksiazka("Tytuł_08", "Jessica", "IPN", 250);
        Ksiazka book_09 = new Ksiazka("Tytuł_09", "Brajan", "IPN", 150);
        Ksiazka book_10 = new Ksiazka("Tytuł_10", "Nikola", "IPN", 260);
        Ksiazka book_11 = new Ksiazka("Tytuł_11", "Vanessa", "IPN", 155);

List<Object> listaKsiazek = new ArrayList<Object>();
        listaKsiazek.add(book_01);
        listaKsiazek.add(book_02);
        listaKsiazek.add(book_03);
        listaKsiazek.add(book_04);
        listaKsiazek.add(book_05);
        listaKsiazek.add(book_06);
        listaKsiazek.add(book_07);
        listaKsiazek.add(book_08);
        listaKsiazek.add(book_09);
        listaKsiazek.add(book_10);
        listaKsiazek.add(book_11);

List<Object> listaObszernychKsiazek = new ArrayList<>();

        for (Object x : listaKsiazek) {
            //wyświetlamy wszystkie elementy za pomocą System.out.println
            System.out.println(x);
        }
        //Usuwamy środkowy element listy
        listaKsiazek.remove((listaKsiazek.size()) / 2);

        System.out.println("===========================Bez środkowej pozycji===================================");
        //Wyświetlamy wszystkie elementy za pomocą System.out.println(...)
        for (Object y : listaKsiazek) {
            System.out.println(y);
        }

        System.out.println("===================================================================================");
        //Wyświetlamy wielkość listy
        System.out.println("Wielkość listy to: " + listaKsiazek.size());

        System.out.println("===================================================================================");
        System.out.println("Lista książek powyżej 200 stron: ");


        for (Object z : listaKsiazek) {
            int strony = 200;

            if (book_01.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_02.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_03.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_04.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_05.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_06.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_07.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_08.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_09.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_10.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            if (book_11.liczbaStron > strony) {
                listaObszernychKsiazek.add(z);
            }
            System.out.println(z);
        }
    }
}