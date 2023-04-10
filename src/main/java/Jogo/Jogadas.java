package Jogo;

import Baralho.Carta;

import java.util.ArrayList;

import static Baralho.BaralhoService.daCarta;

public class Jogadas {

    public static ArrayList<Carta> iniciaJogo (ArrayList<Carta> baralho){
        ArrayList<Carta> cartasJogador = new ArrayList<>();
        cartasJogador.add(daCarta(baralho));
        cartasJogador.add(daCarta(baralho));
        return cartasJogador;
    }

    public static void compraCarta(ArrayList<Carta> baralho, Jogador jogador1, Jogador jogadorPC){
        ArrayList<Carta> cartasJogador1 = jogador1.getCartasJogador();
        cartasJogador1.add(daCarta(baralho));

        ArrayList<Carta> cartasJogadorPC = jogadorPC.getCartasJogador();
        while (jogadorPC.getPontuacao() < 19){
            cartasJogadorPC.add(daCarta(baralho));
        }

    }
}
