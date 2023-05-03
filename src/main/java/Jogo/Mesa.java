package Jogo;

import Baralho.Carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static Jogo.Jogador.*;
import static Baralho.Baralho.*;
import static Jogo.Jogadas.*;


public class Mesa {

// aqui é onde começa o jogo só que não
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String querNovaCarta;

        ArrayList<Carta> baralho = criaBaralho();
        Collections.shuffle(baralho);

        ArrayList<Carta> cartasJogador1 = iniciaJogo(baralho);
        ArrayList<Carta> cartasPC = iniciaJogo(baralho);

        Jogador jogador1 = new Jogador(cartasJogador1, somaDosPontos(cartasJogador1),0);
        Jogador jogadorPC = new Jogador(cartasPC, somaDosPontos(cartasPC), 0);

        mostraStatusJogador(jogador1);
        mostraStatusPC(jogadorPC);

        do {
            System.out.println("Deseja uma nova carta? S/N");
            querNovaCarta = scan.nextLine().toUpperCase();
            try{
                verificaEntrada(querNovaCarta);
            } catch(Exception tecladoException){
                System.out.println("Digite Novamente");
            }
            compraCarta(baralho, jogador1,jogadorPC);
            if (verificaEstouro(jogador1,jogadorPC)){
                break;
            }
        }while (querNovaCarta.equals("S"));
    }


    public static void verificaEntrada(String querNovaCarta) throws TecladoException{
        if (!querNovaCarta.equals("S") && !querNovaCarta.equals("N") ){
            throw new TecladoException("\n Você deve digitar S ou N");
        }
    }
    public static boolean verificaEstouro(Jogador jogador1, Jogador jogadorPC){
        boolean estourou = false;
        if(jogador1.getPontuacao() > 21){
            System.out.println("O jogador estourou: " + jogador1.getPontuacao());
            jogadorPC.setPontuacao(jogadorPC.getPontuacao()+1);
            estourou = true;
        } else if(jogadorPC.getPontuacao() > 21){
            System.out.println("O PC estourou: " + jogadorPC.getPontuacao());
            jogador1.setPontuacao(jogador1.getPontuacao()+1);
            estourou = true;
        }
        return estourou;
    }

    public static int somaDosPontos(ArrayList<Carta> cartasASeremSomadas){
        int soma=0;
        for(Carta somaCartas: cartasASeremSomadas){
            soma += somaCartas.getPontos() ;
        }
        return soma;
    }

    public static void encerraPartida(int pontosJogador, int pontosComputador){
        if (pontosJogador>pontosComputador){
            System.out.println("Parabéns, você venceu!");
        } else{
            System.out.println("Você perdeu...");
        }
    }

}

