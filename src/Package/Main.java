package Package;

import javax.security.auth.kerberos.KerberosKey;

public class Main {

    public static void main(String[] args) {


//​ Klasy i dziedziczenie
// Zadanie 1

        Pies pies = new Pies("Władysław", 32);
        System.out.println(pies);

        Kot kot = new Kot("Stefan", 53);
        System.out.println(kot);

        Zwierze.introduce();


    }
}

