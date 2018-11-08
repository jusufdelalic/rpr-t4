package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {

    private int IDSemestar;
    private ArrayList<Predmet> predmeti; // predmeti na semstru
    private int zbirECTS;

    private boolean dozvoljenBrojECTS() { return dajUkupanBrojECTS()>=30; }
    public int dajUkupanBrojECTS() { return zbirECTS; }




}
