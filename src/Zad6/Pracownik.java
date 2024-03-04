package Zad6;

public class Pracownik implements Dojezdzac, Pracowac, SpedzanieWolnegoCzasu{

    private String zawod;
    private Dojezdzac dojazd;
    private Pracowac praca;
    private SpedzanieWolnegoCzasu wolnyCzas;

    public Pracownik(String zawod, Dojezdzac dojazd, Pracowac praca, SpedzanieWolnegoCzasu wolnyCzas) {
        this.zawod = zawod;
        this.dojazd = dojazd;
        this.praca = praca;
        this.wolnyCzas = wolnyCzas;

    }

    @Override
    public void dojezdzaj() {
        dojazd.dojezdzaj();
    }

    @Override
    public void pracuj() {
        praca.pracuj();
    }

    @Override
    public void spedzajWolnyCzas() {
        wolnyCzas.spedzajWolnyCzas();
    }

    public String getZawod() {
        return zawod;
    }
}
