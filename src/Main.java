public class Main {
    public static void main(String[] args) {
        Uczen uczen1 = new Uczen("pawel", "kikh", "124351235", "3TP");
        Komputer komputer=new Komputer();
        komputer.setNumer(1);
        komputer.setCzyDziala(true);

        Pracownia pracownia = new Pracownia();
        pracownia.dodajKomputerDoUcznia(uczen1, komputer);

        pracownia.wyswietl();
    }
}