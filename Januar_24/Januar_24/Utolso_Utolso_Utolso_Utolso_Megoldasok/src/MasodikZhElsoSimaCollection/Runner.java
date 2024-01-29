package MasodikZhElsoSimaCollection;

import Masodik_Zh_Elso_Feladatasdfasdf.Rendeles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Rendeles> rendelesek = new ArrayList<>();
        rendelesek.add(new Rendeles("Kurva", 123, LocalDate.now(), "Apád","Anyád"));
        rendelesek.add(new Rendeles("Kurva1", 1234, LocalDate.now(), "Apád2","Anyád"));
        rendelesek.add(new Rendeles("Kurva", 123, LocalDate.now(), "Apád","Anyád"));
        rendelesek.add(new Rendeles("Kurva1", 1234, LocalDate.now(), "Apád2","Anyád"));
        rendelesek.add(new Rendeles("Kurva", 123, LocalDate.now(), "Apád","Anyád"));

        for (Rendeles rend : rendelesek) {
            System.out.println(rend);
        }
        System.out.println();

        Collections.sort(rendelesek, new Comparator<Rendeles>() {
            @Override
            public int compare(Rendeles o1, Rendeles o2) {
                int neve = o1.getMegrendeloNeve().compareTo(o2.getMegrendeloNeve());
                if ( neve != 0) {
                    return -neve;
                }
                return -Double.compare(o2.getOsszeg(), o1.getOsszeg());
            }
        });

        for (Rendeles rend : rendelesek) {
            System.out.println(rend);
        }



    }
}
