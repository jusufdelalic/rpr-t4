package ba.unsa.etf.rpr;

public class Student {

    private String ime;
    private String prezime;
    private int brojIndeksa;

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Student(String ime, String prezime, int brojIndeksa) {

        this.setIme(ime);
        this.setPrezime(prezime);
        this.setBrojIndeksa(brojIndeksa);

    }

    public void ispisiPodatke() {

    System.out.println(ime + " " + prezime + " " + brojIndeksa);

    }

    boolean daLiPohadja(Fakultet fakultet) {

        return fakultet.getStudenti().contains(this);

    }


}


