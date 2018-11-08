package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet {

    boolean obavezan;
    private String nazivPredmeta;
    private int IDPredmeta;
    private int maxBrojStudenata;
    private int brojStudenata;
    private int ECTS;

    public boolean pohadja(Student s) {return true;} // da li student pohadja predmet

    public Predmet(String nazivPredmeta, int IDPredmeta, int maxBrojStudenata){}

    public boolean upisiStudenta(Student s) {return true;}

    public boolean  ispisiStudenta(Student s)  {return true;}

    public void ispisiSpisakStudenata() {}




}
