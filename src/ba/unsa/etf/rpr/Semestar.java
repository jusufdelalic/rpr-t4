package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {

    private int IDSemestar;
    private ArrayList<Predmet> predmeti; // predmeti na semstru
    private int zbirECTS;
    private int godinaStudija; // godina
    private int ciklusStudija;

    private boolean dozvoljenBrojECTS() { return dajUkupanBrojECTS()>=30; }
    public int dajUkupanBrojECTS() { return zbirECTS; }

    public void ispisiPredmete(){}



}
