package Elso_Zh_Masodik_Feladatnak_Megoldasa_Hasmap;

import Elso_Zh_Masodik_Pelda_HasmMappes_dolgok.Hallgato;
import Elso_Zh_Masodik_Pelda_HasmMappes_dolgok.Szak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

        HashMap<String, List<Hallgato>> hallgatokMappje = new HashMap<>();

        for ( Hallgato hallgato : hallgatok ) {
            String szakKod = hallgato.getSzak().getKod();
            //Ha még nincs benne, akkor létrehozunk egy új listát
            hallgatokMappje.putIfAbsent(szakKod, new ArrayList<>());
            //Hozzáadjuk a Hallgato-t a szakhoz tartozó listához
            hallgatokMappje.get(szakKod).add(hallgato);

        }



    }
}
