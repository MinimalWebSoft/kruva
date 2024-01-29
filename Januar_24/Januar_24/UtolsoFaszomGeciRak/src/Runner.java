import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Auto> autok = new ArrayList<>();
        autok.add(new Auto("DMC-111", "Sedan", "Bmw", LocalDate.now(), 100));
        autok.add(new Auto("DMC-112", "Kombi", "Audi", LocalDate.now(), 200));
        autok.add(new Auto("DMC-113", "Coupe", "Ford", LocalDate.now(), 300));
        autok.add(new Auto("DMC-114", "Cabrio", "Audi", LocalDate.now(), 150));
        autok.add(new Auto("DMC-115", "SportCoupe", "Bmw", LocalDate.now(), 400));

        for ( Auto k : autok) {
            System.out.println(k);
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
        System.out.println();

        for ( Auto k : autok) {
            System.out.println(k);
        }


    }
}
