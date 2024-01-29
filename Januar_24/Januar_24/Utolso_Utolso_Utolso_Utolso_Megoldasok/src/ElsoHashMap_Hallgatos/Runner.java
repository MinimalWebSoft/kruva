package ElsoHashMap_Hallgatos;

import Elso_Zh_Masodik_Pelda_HasmMappes_dolgok.Hallgato;
import Elso_Zh_Masodik_Pelda_HasmMappes_dolgok.Szak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Hallgato> hallgatok = new ArrayList<>();

        Szak matekszak = new Elso_Zh_Masodik_Pelda_HasmMappes_dolgok.Szak("Matek Szak", "Matek1", 6);
        Szak infoszak = new Szak("Info Szak", "Info1", 6);

        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian David", matekszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian mATE", infoszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian", infoszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian", infoszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian Matyas", infoszak));

        HashMap<Szak, ArrayList<Hallgato>> hallgatokListaja = hallgatok.stream().collect(
                Collectors.groupingBy(Hallgato::getSzak, HashMap::new, Collectors.toCollection(ArrayList::new)));
        for ( Szak szak : hallgatokListaja.keySet()) {
            System.out.println(szak.getNev()  + " ez a neve");
            hallgatokListaja.get(szak).forEach(System.out::println);
        }



    }

}
