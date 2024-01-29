package Elso_Zh_Masodik_Feladat_TreeMappes_Feladat;

import java.util.Objects;

public class Tantargy {
    private String kod;
    private String nev;
    private int felevek;
    private int kredit;
    private Szak szak;

    public Tantargy(String kod, String nev, int felevek, int kredit, Szak szak) {
        this.kod = kod;
        this.nev = nev;
        this.felevek = felevek;
        this.kredit = kredit;
        this.szak = szak;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getFelevek() {
        return felevek;
    }

    public void setFelevek(int felevek) {
        this.felevek = felevek;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public Szak getSzak() {
        return szak;
    }

    public void setSzak(Szak szak) {
        this.szak = szak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tantargy tantargy = (Tantargy) o;
        return felevek == tantargy.felevek && kredit == tantargy.kredit && Objects.equals(kod, tantargy.kod) && Objects.equals(nev, tantargy.nev) && Objects.equals(szak, tantargy.szak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kod, nev, felevek, kredit, szak);
    }

    @Override
    public String toString() {
        return "Tantargy{" +
                "kod='" + kod + '\'' +
                ", nev='" + nev + '\'' +
                ", felevek=" + felevek +
                ", kredit=" + kredit +
                ", szak=" + szak +
                '}';
    }
}
