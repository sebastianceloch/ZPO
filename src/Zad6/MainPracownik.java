package Zad6;

import java.util.ArrayList;

public class MainPracownik {
    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new Pracownik("Lekarz",new Rower(), new Leczenie(), new Silownia()));
        pracownicy.add(new Pracownik("Listonosz", new Samochod(), new RoznoszenieListow(), new LiteraturaPopularnoNaukowa()));

        for(Pracownik a:pracownicy)
        {
            System.out.println(a.getZawod());
            a.dojezdzaj();
            a.pracuj();
            a.spedzajWolnyCzas();
        }
    }
}
