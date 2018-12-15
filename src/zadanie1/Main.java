package zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kot kot = new Kot();
        Pies pies = new Pies();

        List<Zwierze> listaZwierzat = new ArrayList<>();
        listaZwierzat.add(new Kot());
        listaZwierzat.add(new Kot());
        listaZwierzat.add(new Kot());
        listaZwierzat.add(new Kot());
        listaZwierzat.add(new Kot());
        listaZwierzat.add(new Pies());
        listaZwierzat.add(new Pies());
        listaZwierzat.add(new Pies());
        listaZwierzat.add(new Pies());

        for(Zwierze z : listaZwierzat) {
            if(z instanceof Glos) {
                Glos g = (Glos) z;
                g.dajGlos();
            }
        }
    }
}
