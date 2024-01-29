package Masodik_Zh_Elso_Feladat_Eteles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Etel> etelek = new ArrayList<>();
        etelek.add(new Masodik_Zh_Elso_Feladat_Eteles.Etel("almap","13",12, LocalDate.now(), "Kinai"));
        etelek.add(new Masodik_Zh_Elso_Feladat_Eteles.Etel("almak","11",12, LocalDate.now(), "Olasz"));
        etelek.add(new Masodik_Zh_Elso_Feladat_Eteles.Etel("alma","10",10, LocalDate.now(), "Kinai"));
        etelek.add(new Masodik_Zh_Elso_Feladat_Eteles.Etel("almap","13",12, LocalDate.now(), "Olasz"));
        etelek.add(new Masodik_Zh_Elso_Feladat_Eteles.Etel("alma","10",10, LocalDate.now(), "Kinai"));

        Collections.sort(etelek, new Comparator<Etel>() {
            @Override
            public int compare(Etel o1, Etel o2) {
                int eteltipus = o1.getEtelTipus().compareTo(o2.getEtelTipus());
                if ( eteltipus != 0) {
                    return eteltipus;
                }
                return o1.getLejarasiDatuma().compareTo(o2.getLejarasiDatuma());
            }
        });

        for ( Etel etel : etelek) {
            System.out.println(etel);
        }

    }
}
