package Elso_Zh_Masodik_Feladatnak_Megoldasa_Hasmap;

import java.util.Objects;

public class Hallgato {
    private String neptunkod;
    private String nev;
    private Szak szak;

    public Hallgato(String neptunkod, String nev, Szak szak) {
        this.neptunkod = neptunkod;
        this.nev = nev;
        this.szak = szak;
    }

    public String getNeptunkod() {
        return neptunkod;
    }

    public void setNeptunkod(String neptunkod) {
        this.neptunkod = neptunkod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
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
        Hallgato hallgato = (Hallgato) o;
        return Objects.equals(neptunkod, hallgato.neptunkod) && Objects.equals(nev, hallgato.nev) && Objects.equals(szak, hallgato.szak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neptunkod, nev, szak);
    }

    @Override
    public String toString() {
        return "Hallgato{" +
                "neptunkod='" + neptunkod + '\'' +
                ", nev='" + nev + '\'' +
                ", szak=" + szak +
                '}';
    }
}
