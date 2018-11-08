package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Predmet {

    public static enum vrstaPredmeta {OBAVEZAN, IZBORAN};
    private String nazivPredmeta;
    private int sifraPredmeta;
    private int maxBrojStudenata;
    private int minBrojStudenata;
    private ArrayList<Student> studentiNaPredmetu;
    private int brojStudenata;
    private int ECTS;

    public boolean pohadja(Student s) {} // da li student pohadja predmet


    public Predmet(String nazivPredmeta, int IDPredmeta, int maxBrojStudenata){}

    public boolean upisiStudenta(Student s) {}

    public boolean  ispisiStudenta(Student s)  {}

    public void ispisiSpisakStudenata() {}

    public vrstaPredmeta(){}


}
