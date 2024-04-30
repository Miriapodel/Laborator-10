import java.util.Objects;

public class Magazin {
    private String numeMagazin;
    private Integer numarAngajati;

    public Magazin(String numeMagazin, Integer numarAngajati) {
        this.numeMagazin = numeMagazin;
        this.numarAngajati = numarAngajati;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public Integer getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(Integer numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazin magazin = (Magazin) o;
        return Objects.equals(numeMagazin, magazin.numeMagazin) && Objects.equals(numarAngajati, magazin.numarAngajati);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeMagazin, numarAngajati);
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "numeMagazin='" + numeMagazin + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
