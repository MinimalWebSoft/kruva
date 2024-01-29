package ElsoZh_Elso_Faszom_Feladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Integer darab = Integer.parseInt(args[0]);
        ArrayList<Cipo> cipok = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i < darab; i++) {
            String sor = sc.nextLine();
            String[] adatok = sor.split(";");
            cipok.add(new Cipo(adatok[0], Double.parseDouble(adatok[1]),adatok[2], adatok[3]));
        }

        sc.close();

        Collections.sort(cipok, new Comparator<Cipo>() {
            @Override
            public int compare(Cipo o1, Cipo o2) {
                int evszak = o1.getEvszak().compareTo(o2.getEvszak());
                if ( evszak != 0) {
                    return evszak;
                }
                int modellszam = o1.getModellszam().compareTo(o2.getModellszam());
                if ( modellszam != 0) {
                    return modellszam;
                }
                int meret = Double.compare(o1.getMeret(), o2.getMeret());
                return -meret;
            }
        });

        for ( Cipo cip : cipok) {
            System.out.println(cip);
        }

    }

}
