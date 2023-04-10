package Baralho;

import java.util.ArrayList;
import java.util.Collections;

public class BaralhoService {

    public static void mostraBaralho(ArrayList<Carta> baralho){
        for(Carta i : baralho){
            System.out.println(i.getValor() + " de " + i.getNaipe());
        }
    }
    public static Carta daCarta(ArrayList<Carta> baralho){
        Carta carta =  baralho.get(0);
        baralho.remove(0);
        Collections.shuffle(baralho);
        return carta;
    }
}
