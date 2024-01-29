package Masodik_Zh_Masodik_Feladat_Mappes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Telepules> telepulesek = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("telepules.txt"));
        sc.nextLine();

        while ( sc.hasNext() ){
            String[] adatok = sc.nextLine().split(":");
            telepulesek.add(new Telepules(adatok[0], Integer.parseInt(adatok[1]),
                    Integer.parseInt(adatok[2]), LocalDate.parse(adatok[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                            adatok[4]));
        }

        sc.close();

        telepulesek.stream().filter(telepules -> telepules.getLakossak()<12000 && telepules.getMegye().contains("Kis")).forEach(System.out::println);
        Telepules legnagyobb = Collections.max(telepulesek, Comparator.comparing(Telepules::getMegye));
        System.out.println(legnagyobb.getNev());

        Map<String, List<Telepules>> csoportositottTelepulesek = telepulesek.stream().collect(Collectors.groupingBy(Telepules::getMegye));

        for ( Map.Entry<String, List<Telepules>> entry : csoportositottTelepulesek.entrySet()) {
            System.out.println("Megye" + entry.getValue());
            for ( Telepules tel : entry.getValue()) {
                System.out.println( " " + tel);
            }
        }

    }
}
