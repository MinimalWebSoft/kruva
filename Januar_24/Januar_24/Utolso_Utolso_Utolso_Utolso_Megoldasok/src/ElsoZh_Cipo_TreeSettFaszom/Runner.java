package ElsoZh_Cipo_TreeSettFaszom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        int darabok = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        ArrayList<Cipo> cipok = new ArrayList<>();

        for ( int i = 0; i < darabok; i ++) {
            String sor = sc.nextLine();
            String[] adatok = sor.split(";");
            cipok.add(new Cipo(adatok[0], Double.parseDouble(adatok[1]), adatok[2], adatok[3]));
        }

        sc.close();

       TreeSet<Cipo> cipokSzettje = cipok.stream().sorted(
               Comparator.comparing(Cipo::getEvszak)
                       .thenComparing(Cipo::getModellszam)
                       .thenComparing(Comparator.comparing(Cipo::getMeret).reversed()))
               .collect(Collectors.toCollection(TreeSet::new));

        for ( Cipo cipo : cipokSzettje) {
            System.out.println(cipo);
        }




    }
}
