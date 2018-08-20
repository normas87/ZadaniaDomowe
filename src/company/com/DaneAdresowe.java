package company.com;
//Zadanie 4
//Stworzyć klasę Dane Adresowe, która będzie zawierała pola dotyczące adresu, numeru telefonu, maila itp.
public class DaneAdresowe {
    private String adres, mail;
   private double telefon;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getTelefon() {
        return telefon;
    }

    public void setTelefon(double telefon) {
        this.telefon = telefon;
    }

    DaneAdresowe (String adres, String mail, double telefon){
        this.adres=adres;
        this.mail=mail;
        this.telefon=telefon;
    }
}
