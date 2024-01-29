package Elso_zH_TreeMappGeci;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Tantargy> tantargyak = new ArrayList<>();

        Szak matekszak = new Szak("MatekSzak", "123", 6);
        Szak infoszak = new Szak("InfoSzak", "321", 7);

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

        TreeMap<Szak, ArrayList<Tantargy>> tantargyakMap = tantargyak.stream().collect(
                Collectors.groupingBy(Tantargy::getSzak, TreeMap::new, Collectors.toCollection(ArrayList::new)));

        for (Szak szak : tantargyakMap.keySet()) {
            System.out.println(szak.getNev() + " a neve");
            tantargyakMap.get(szak).forEach(System.out::println);
            System.out.println();
        }

    }
}
