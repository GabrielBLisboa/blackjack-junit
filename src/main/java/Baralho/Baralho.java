package Baralho;

import java.util.ArrayList;
import java.util.HashMap;

public class Baralho extends BaralhoService {
    public static ArrayList<Carta> criaBaralho() {
        ArrayList<Carta> baralho = new ArrayList<>();

        String[] naipes = {"Copas", "Paus", "Ouros", "Espadas"};

        HashMap<String, Integer> figuras = new HashMap<>();
        figuras.put("Ás", 1);
        figuras.put("Valete", 10);
        figuras.put("Dama",10);
        figuras.put("Reis",10);

        for (String naipe : naipes) {
            for (int j = 2; j < 11; j++) {
                Carta carta = new Carta(Integer.toString(j), naipe, j);
                baralho.add(carta);
            }
        }
        for (String naipe : naipes) {
            for (String figura : figuras.keySet()) {
                Carta carta = new Carta(figura, naipe, figuras.get(figura));
                baralho.add(carta);
            }
        }
        return baralho;
    }
}
