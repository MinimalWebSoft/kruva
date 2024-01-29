package Masodik_Zh_Elso_Feladatanak_Megoldasa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Auto> autok = new ArrayList<>();
        autok.add(new Auto("ABC_111", "AudiTTT", "Audi", LocalDate.now(), 1233));
        autok.add(new Auto("ABC_1112", "AudiTT", "Audi", LocalDate.now(), 1234));
        autok.add(new Auto("ABC_1113", "AudiTT", "Bmw", LocalDate.now(), 1233));
        autok.add(new Auto("ABC_1114", "AudiTTT", "Audi", LocalDate.now(), 1233));
        autok.add(new Auto("ABC_1115", "AudiTT", "Bmw", LocalDate.now(), 1232));

        for ( Auto auto : autok) {
            System.out.println(auto);
        }

        Collections.sort(autok, new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                int marka = o1.getMarka().compareTo(o2.getMarka());
                if ( marka != 0) {
                    return marka;
                }
                int tipus = o1.getTipus().compareTo(o2.getTipus());
                if ( tipus != 0) {
                    return tipus;
                }
                return o1.getRendszam().compareTo(o2.getRendszam());
            }
        });

        System.out.println("------");

        for ( Auto auto : autok) {
            System.out.println(auto);
        }

    }
}
