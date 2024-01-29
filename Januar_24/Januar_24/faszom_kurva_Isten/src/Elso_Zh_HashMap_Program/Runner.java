package Elso_Zh_HashMap_Program;

import Elso_Zh_Masodik_Pelda_HasmMappes_dolgok.Hallgato;
import Elso_Zh_Masodik_Pelda_HasmMappes_dolgok.Szak;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Hallgato> hallgatok = new ArrayList<>();

        Szak matekszak = new Szak("Matek Szak", "Matek1", 6);
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

       /* HashMap<Szak, ArrayList<Hall>> tantargyak_Map = tantargyak.stream()
                .collect(Collectors.groupingBy(Tantargy::getSzak, HashMap::new, Collectors.toList()));

        for (Szak szak : tantargyak_Map.keySet()) {
            System.out.println(szak.getNev() + " szakhoz tartozó tantárgyak:");
            tantargyak_Map.get(szak).forEach(System.out::println);
            System.out.println();
        }

        */

       /* HashMap<Szak, ArrayList<Hallgato>> hallgatokMapje = hallgatok.stream()
                .collect(Collectors.groupingBy(Hallgato::getSzak, HashMap::new, Collectors.toCollection(ArrayList::new)));
        for ( Szak szak : hallgatokMapje.keySet()) {
            System.out.println(szak.getNev() + "Szak neve");
            hallgatokMapje.get(szak).forEach(System.out::println);
        }

        */

        HashMap<Szak, ArrayList<Hallgato>> hallgatoMap = hallgatok.stream()
                .collect(Collectors.groupingBy(Hallgato::getSzak, HashMap::new, Collectors.toCollection(ArrayList::new)));
        for (Szak szak : hallgatoMap.keySet()) {
            System.out.println(szak.getNev() + "ez a neve");
            hallgatoMap.get(szak).forEach(System.out::println);
            System.out.println();

        }



    }



}
