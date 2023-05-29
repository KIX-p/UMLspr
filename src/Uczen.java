public class Uczen extends Osoba{
    private String klasa;
    private boolean czyzdaje;

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public boolean isCzyzdaje() {
        return czyzdaje;
    }

    public void setCzyzdaje(boolean czyzdaje) {
        this.czyzdaje = czyzdaje;
    }

    public Uczen(String imie, String nazwisko, String PESEL, String klasa) {
        super(imie, nazwisko, PESEL);
        this.klasa = klasa;
    }
}
