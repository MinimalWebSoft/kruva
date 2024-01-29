package Elso_zH_TreeMappGeci;

import java.util.Objects;

public class Szak implements Comparable<Szak>{
    private String nev;
    private String kod;
    private int felevekSzama;

    public Szak(String nev, String kod, int felevekSzama) {
        this.nev = nev;
        this.kod = kod;
        this.felevekSzama = felevekSzama;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getFelevekSzama() {
        return felevekSzama;
    }

    @Override
    public int compareTo(Szak other) {
        return this.nev.compareTo(other.nev);
    }

    public void setFelevekSzama(int felevekSzama) {
        this.felevekSzama = felevekSzama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Szak szak = (Szak) o;
        return felevekSzama == szak.felevekSzama && Objects.equals(nev, szak.nev) && Objects.equals(kod, szak.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, kod, felevekSzama);
    }

    @Override
    public String toString() {
        return "Szak{" +
                "nev='" + nev + '\'' +
                ", kod='" + kod + '\'' +
                ", felevekSzama=" + felevekSzama +
                '}';
    }
}
