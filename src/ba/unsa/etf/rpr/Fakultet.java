package ba.unsa.etf.rpr;

import java.util.Set;

public class Fakultet {

    private Set<Predmet> predmeti;
    private Set<Student> studenti;
    private Set<PlanStudija> planoviStudija;

    public Set<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(Set<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public Set<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(Set<Student> studenti) {
        this.studenti = studenti;
    }

    public Set<PlanStudija> getPlanoviStudija() {
        return planoviStudija;
    }

    public void setPlanoviStudija(Set<PlanStudija> planoviStudija) {
        this.planoviStudija = planoviStudija;
    }
}
