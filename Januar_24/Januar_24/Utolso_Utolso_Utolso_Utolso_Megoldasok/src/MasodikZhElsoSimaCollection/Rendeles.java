package MasodikZhElsoSimaCollection;

import java.time.LocalDate;
import java.util.Objects;

public class Rendeles {
    private String rendelesSzam;
    private double osszeg;
    private LocalDate rendelesDatuma;
    private String megrendelNeve;
    private String megrendeloCime;

    public Rendeles(String rendelesSzam, double osszeg, LocalDate rendelesDatuma, String megrendelNeve, String megrendeloCime) {
        this.rendelesSzam = rendelesSzam;
        this.osszeg = osszeg;
        this.rendelesDatuma = rendelesDatuma;
        this.megrendelNeve = megrendelNeve;
        this.megrendeloCime = megrendeloCime;
    }

    public String getRendelesSzam() {
        return rendelesSzam;
    }

    public void setRendelesSzam(String rendelesSzam) {
        this.rendelesSzam = rendelesSzam;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(double osszeg) {
        this.osszeg = osszeg;
    }

    public LocalDate getRendelesDatuma() {
        return rendelesDatuma;
    }

    public void setRendelesDatuma(LocalDate rendelesDatuma) {
        this.rendelesDatuma = rendelesDatuma;
    }

    public String getMegrendelNeve() {
        return megrendelNeve;
    }

    public void setMegrendelNeve(String megrendelNeve) {
        this.megrendelNeve = megrendelNeve;
    }

    public String getMegrendeloCime() {
        return megrendeloCime;
    }

    public void setMegrendeloCime(String megrendeloCime) {
        this.megrendeloCime = megrendeloCime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rendeles rendeles = (Rendeles) o;
        return this.rendelesSzam == ((Rendeles) o).rendelesSzam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendelesSzam, osszeg, rendelesDatuma, megrendelNeve, megrendeloCime);
    }

    @Override
    public String toString() {
        return "Rendeles{" +
                "rendelesSzam='" + rendelesSzam + '\'' +
                ", osszeg=" + osszeg +
                ", rendelesDatuma=" + rendelesDatuma +
                ", megrendelNeve='" + megrendelNeve + '\'' +
                ", megrendeloCime='" + megrendeloCime + '\'' +
                '}';
    }
}
