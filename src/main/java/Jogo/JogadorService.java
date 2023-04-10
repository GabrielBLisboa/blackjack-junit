package Jogo;

import Baralho.Carta;

import java.util.ArrayList;

public class JogadorService {
    public static void mostraStatusJogador(Jogador jogador1){
        System.out.println("");
        System.out.println("Suas cartas: ");
        System.out.println(jogador1.getCartasJogador());
        System.out.println("------------------------------");
        System.out.println("Seus pontos: " + jogador1.getPontuacao());
        System.out.println("");
    }
    public static void mostraStatusPC(Jogador jogadorPC){
        System.out.println("");
        System.out.println("Cartas do Computador: ");
        System.out.println(jogadorPC.getCartasJogador());
        System.out.println("------------------------------");
        System.out.println("Pontos do computador: " + jogadorPC.getPontuacao());
        System.out.println("");
    }
}
