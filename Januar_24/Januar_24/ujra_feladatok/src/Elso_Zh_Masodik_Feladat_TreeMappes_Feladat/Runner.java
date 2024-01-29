package Elso_Zh_Masodik_Feladat_TreeMappes_Feladat;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) {
        Szak matekszak = new Szak("MatekSzak", "123",6);
        Szak infoszak = new Szak("InfoSzak", "321", 7);
        ArrayList<Tantargy> tantargyak = new ArrayList<>();
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Matematikai analízis I.", "MANAL-1", 1, 5, matekszak));
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Matematikai analízis II.", "MANAL-2", 2, 5, matekszak));
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Diszkrét matematika I.", "MDISZK-1", 1, 5, matekszak));
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Diszkrét matematika II.", "MDISZK-2", 2, 5, matekszak));
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Lineáris Algebra B", "MALGB-1", 1, 5, matekszak));
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Numerikus analízis", "MN-1", 1, 5, matekszak));

        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Programozás alapjai I.", "IPROG-1", 1, 5, infoszak));
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Programozás alapjai II.", "IPROG-2", 2, 5, infoszak));
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Számítógép hálózatok", "IHALO", 2, 5, infoszak));
        tantargyak.add(new Elso_Zh_Masodik_Feladat_TreeMappes_Feladat.Tantargy("Számítógép architektúrák", "IARCH", 2, 5, infoszak));


        for ( Tantargy tant : tantargyak) {
            System.out.println(tant);
        }

        TreeMap<Szak,ArrayList<Tantargy>> tantargyakMapp = new TreeMap<>(new Comparator<Szak>() {
            @Override
            public int compare(Szak o1, Szak o2) {
                return o1.getKod().compareTo(o2.getKod());
            }
        });

        for ( Tantargy tantargy : tantargyak) {
            Szak szaktantargy = tantargy.getSzak();

            if (!tantargyakMapp.containsKey(szaktantargy)) {
                tantargyakMapp.put(szaktantargy, new ArrayList<Tantargy>());
            }

            ArrayList<Tantargy> targyak = (ArrayList<Tantargy>) tantargyakMapp.get(szaktantargy);
            targyak.add(tantargy);

        }
        for ( Map.Entry<Szak, ArrayList<Tantargy>> ertek : tantargyakMapp.entrySet()) {
            Szak szak = ertek.getKey();

            System.out.println(szak.getNev() + "szakhoz tartozó tantárgyak");

            for ( Tantargy tantargy : ertek.getValue()) {
                System.out.println(tantargy.toString());
            }
        }


    }
}
