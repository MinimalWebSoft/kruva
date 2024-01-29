package MasodikZh2_Megoldas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Cipo> cipok = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("cipo.txt"));
        sc.nextLine();

        while ( sc.hasNext() ) {
            String sor = sc.nextLine();
            String[] adatok = sor.split("/");
            cipok.add(new Cipo(adatok[0], Integer.parseInt(adatok[1]),
                    adatok[2], adatok[3], LocalDate.parse(adatok[4], DateTimeFormatter.ofPattern("yyyy.MM.dd"))));
        }

        sc.close();

        for ( Cipo cipo : cipok) {
            System.out.println(cipo);
        }

       cipok.stream().filter(cipo -> cipo.getSzin().contains("fekete") && cipo.getMeret()<30)
               .forEach(System.out::println);
        Cipo legkisebb = Collections.min(cipok, Comparator.comparing(Cipo::getMeret));
        System.out.println(legkisebb.getModellszam());
        Map<String, List<Cipo>> evszakMap = cipok.stream().collect(Collectors.groupingBy(Cipo::getEvszak));
        evszakMap.forEach((a,b) -> {
            System.out.println(a + b);
        });


    }
}
