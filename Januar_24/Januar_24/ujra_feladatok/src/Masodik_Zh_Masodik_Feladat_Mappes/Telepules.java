package Masodik_Zh_Masodik_Feladat_Mappes;

import java.time.LocalDate;
import java.util.Objects;

public class Telepules {
    private String nev;
    private int iranyitoszam;
    private int lakossak;
    private LocalDate alapitasDatuma;
    private String megye;

    public Telepules(String nev, int iranyitoszam, int lakossak, LocalDate alapitasDatuma, String megye) {
        this.nev = nev;
        this.iranyitoszam = iranyitoszam;
        this.lakossak = lakossak;
        this.alapitasDatuma = alapitasDatuma;
        this.megye = megye;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public int getLakossak() {
        return lakossak;
    }

    public void setLakossak(int lakossak) {
        this.lakossak = lakossak;
    }

    public LocalDate getAlapitasDatuma() {
        return alapitasDatuma;
    }

    public void setAlapitasDatuma(LocalDate alapitasDatuma) {
        this.alapitasDatuma = alapitasDatuma;
    }

    public String getMegye() {
        return megye;
    }

    public void setMegye(String megye) {
        this.megye = megye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telepules telepules = (Telepules) o;
        return iranyitoszam == telepules.iranyitoszam && lakossak == telepules.lakossak && Objects.equals(nev, telepules.nev) && Objects.equals(alapitasDatuma, telepules.alapitasDatuma) && Objects.equals(megye, telepules.megye);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, iranyitoszam, lakossak, alapitasDatuma, megye);
    }

    @Override
    public String toString() {
        return "Telepules{" +
                "nev='" + nev + '\'' +
                ", iranyitoszam=" + iranyitoszam +
                ", lakossak=" + lakossak +
                ", alapitasDatuma=" + alapitasDatuma +
                ", megye='" + megye + '\'' +
                '}';
    }
}
