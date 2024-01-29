package masodik_zh_elso_feladat_geci_etel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Etel> etelek = new ArrayList<>();
        etelek.add(new Etel("almap","13",12, LocalDate.now(), "Kinai"));
        etelek.add(new Etel("almak","11",12, LocalDate.now(), "Olasz"));
        etelek.add(new Etel("alma","10",10, LocalDate.now(), "Kinai"));
        etelek.add(new Etel("almap","13",12, LocalDate.now(), "Olasz"));
        etelek.add(new Etel("alma","10",10, LocalDate.now(), "Kinai"));

        Collections.sort(etelek, new Comparator<Etel>() {
            @Override
            public int compare(Etel o1, Etel o2) {
                int tipus = o1.getEtelTipus().compareTo(o2.getEtelTipus());
                if ( tipus != 0) {
                    return tipus;
                }
                return o1.getLejarasDatuma().compareTo(o2.getLejarasDatuma());
            }
        });

        for ( Etel etel : etelek) {
            System.out.println(etel);
        }
    }
}
