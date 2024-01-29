package TelepulesGeciMap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args)  throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("telepules.txt"));
        ArrayList<Telepules> telepulesek = new ArrayList<>();
        sc.nextLine();

        while ( sc.hasNext()) {
            String sor = sc.nextLine();
            String[] adatok = sor.split(":");
            telepulesek.add(new Telepules(adatok[0], Integer.parseInt(adatok[1]),
                    Integer.parseInt(adatok[2]), LocalDate.parse(adatok[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    adatok[4]));
        }
        sc.close();



        telepulesek.stream().filter(telepules -> telepules.getLakossag()<12000 && telepules.getMegye().contains("Kis"))
                .forEach(System.out::println);

        Telepules legnagyobb = Collections.max(telepulesek, Comparator.comparing(Telepules::getLakossag));
        System.out.println(legnagyobb.getNev());

        Map<String, List<Telepules>> megyeSzerint = telepulesek.stream().collect(
                Collectors.groupingBy(Telepules::getMegye)
        );

        megyeSzerint.forEach((a, b) -> {
            System.out.println(a + b);
        });


    }
}
