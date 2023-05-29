import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Pracownia {
    private Map<Osoba,Komputer> przypisania= new HashMap<>();


    public Map<Osoba, Komputer> getPrzypisania() {
        return przypisania;
    }

    public void setPrzypisania(Map<Osoba, Komputer> przypisania) {
        this.przypisania = przypisania;
    }

    public void dodajKomputerDoUcznia(Uczen uczen, Komputer komputer){
        przypisania.put(uczen,komputer);
    }
    Set<Map.Entry<Osoba, Komputer>> entries = przypisania.entrySet();
    public void wyswietl(){
        for(Map.Entry<Osoba,Komputer> entry: entries){
               Osoba imie = entry.getKey();
               Osoba nazwisko = entry.getKey();
               Komputer nr_komp = entry.getValue();

            System.out.println(imie.getImie() + "," + nazwisko.getNazwisko() + "->" + nr_komp.getNumer());




        }
    }



}
