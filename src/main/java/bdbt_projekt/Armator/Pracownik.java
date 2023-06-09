package bdbt_projekt.Armator;

import java.util.Date;

public class Pracownik {
    private int ID_pracownika;
    private String Imie;
    private String Nazwisko;
    private String Nr_Konta;
    private String Data_urodzenia;
    private String Plec;
    private String Pesel;
    private String Email;
    private String Nr_telefonu;
    private int ID_adresu;
    private int ID_stanowiska;
    private int ID_armatora;

    public Pracownik(){}

    public Pracownik(int ID_pracownika, String imie, String nazwisko, String nr_Konta, String data_urodzenia, String plec, String pesel, String email, String nr_telefonu, int ID_adresu, int ID_stanowiska, int ID_armatora) {
        super();
        this.ID_pracownika = ID_pracownika;
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.Nr_Konta = nr_Konta;
        this.Data_urodzenia = data_urodzenia;
        this.Plec = plec;
        this.Pesel = pesel;
        this.Email = email;
        this.Nr_telefonu = nr_telefonu;
        this.ID_adresu = ID_adresu;
        this.ID_stanowiska = ID_stanowiska;
        this.ID_armatora = ID_armatora;
    }

    public int getID_pracownika() {
        return ID_pracownika;
    }

    public void setID_pracownika(int ID_pracownika) {
        this.ID_pracownika = ID_pracownika;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getNr_Konta() {
        return Nr_Konta;
    }

    public void setNr_Konta(String nr_Konta) {
        Nr_Konta = nr_Konta;
    }

    public String getData_urodzenia() {
        return Data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        Data_urodzenia = data_urodzenia;
    }

    public String getPlec() {
        return Plec;
    }

    public void setPlec(String plec) {
        Plec = plec;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNr_telefonu() {
        return Nr_telefonu;
    }

    public void setNr_telefonu(String nr_telefonu) {
        Nr_telefonu = nr_telefonu;
    }

    public int getID_adresu() {
        return ID_adresu;
    }

    public void setID_adresu(int ID_adresu) {
        this.ID_adresu = ID_adresu;
    }

    public int getID_stanowiska() {
        return ID_stanowiska;
    }

    public void setID_stanowiska(int ID_stanowiska) {
        this.ID_stanowiska = ID_stanowiska;
    }

    public int getID_armatora() {
        return ID_armatora;
    }

    public void setID_armatora(int ID_armatora) {
        this.ID_armatora = ID_armatora;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "ID_pracownika=" + ID_pracownika +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Nr_Konta='" + Nr_Konta + '\'' +
                ", Data_urodzenia=" + Data_urodzenia +
                ", Plec='" + Plec + '\'' +
                ", Pesel='" + Pesel + '\'' +
                ", Email='" + Email + '\'' +
                ", Nr_telefonu='" + Nr_telefonu + '\'' +
                ", ID_adresu=" + ID_adresu +
                ", ID_stanowiska=" + ID_stanowiska +
                ", ID_armatora=" + ID_armatora +
                '}';
    }
}
