package CiposKutyaFasza;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int darabok = Integer.parseInt(args[0]);
        System.out.println(darabok);
        ArrayList<Cipo> cipok = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i < darabok; i ++) {
            String sor = sc.nextLine();
            String[] adatok = sor.split(";");
            cipok.add(new Cipo(adatok[0], Double.parseDouble(adatok[1]), adatok[2], adatok[3]));
        }
        sc.close();

    }
}
