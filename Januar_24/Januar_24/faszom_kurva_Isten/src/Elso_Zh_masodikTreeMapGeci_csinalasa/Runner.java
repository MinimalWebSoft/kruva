package Elso_Zh_masodikTreeMapGeci_csinalasa;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Tantargy> tantargyak = new ArrayList<>();
        Szak matekszak = new Szak("MatekSzak", "123", 6);
        Szak infoszak = new Szak("InfoSzak", "321", 7);
        tantargyak.add(new Tantargy("Matematikai analízis I.", "MANAL-1", 1, 5, matekszak));
        tantargyak.add(new Tantargy("Programozás alapjai II.", "IPROG-2", 2, 5, infoszak));
        tantargyak.add(new Tantargy("Programozás alapjai II.", "IPROG-2", 2, 5, infoszak));
        tantargyak.add(new Tantargy("Programozás alapjai II.", "IPROG-2", 2, 5, infoszak));
        tantargyak.add(new Tantargy("Matematikai analízis II.", "MANAL-2", 2, 5, matekszak));
        tantargyak.add(new Tantargy("Diszkrét matematika I.", "MDISZK-1", 1, 5, matekszak));
        tantargyak.add(new Tantargy("Diszkrét matematika II.", "MDISZK-2", 2, 5, matekszak));
        tantargyak.add(new Tantargy("Lineáris Algebra B", "MALGB-1", 1, 5, matekszak));
        tantargyak.add(new Tantargy("Numerikus analízis", "MN-1", 1, 5, matekszak));
        tantargyak.add(new Tantargy("Programozás alapjai I.", "IPROG-1", 1, 5, infoszak));
        tantargyak.add(new Tantargy("Programozás alapjai II.", "IPROG-2", 2, 5, infoszak));
        tantargyak.add(new Tantargy("Számítógép hálózatok", "IHALO", 2, 5, infoszak));
        tantargyak.add(new Tantargy("Számítógép architektúrák", "IARCH", 2, 5, infoszak));

        /*TreeMap<Szak, ArrayList<Tantargy>> tantargyakMap = new TreeMap<>(Comparator.comparing(Szak::getKod));

        for (Tantargy tantargy : tantargyak) {
            Szak szaktantargy = tantargy.getSzak();
            tantargyakMap.computeIfAbsent(szaktantargy, k -> new ArrayList<>()).add(tantargy);
        }

        for (Szak szak : tantargyakMap.keySet()) {
            System.out.println(szak.getNev() + " szakhoz tartozó tantárgyak:");
            tantargyakMap.get(szak).forEach(System.out::println);
            System.out.println();
        }
    }

         */


        TreeMap<Szak, ArrayList<Tantargy>> tantargyak_Map = new TreeMap<>(Comparator.comparing(Szak::getKod));
        for ( Tantargy tantargy : tantargyak ) {
            Szak tantargy_szak = tantargy.getSzak();
            tantargyak_Map.computeIfAbsent(tantargy_szak, k->new ArrayList<>()).add(tantargy);
        }
        for (Szak szak : tantargyak_Map.keySet()) {
            System.out.println(szak.getNev() + "szakhoz tartozo nevek tesom");
            tantargyak_Map.get(szak).forEach(System.out::println);
            System.out.println();
        }



    }
}
