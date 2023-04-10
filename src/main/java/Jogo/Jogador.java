package Jogo;

import Baralho.Carta;

import java.util.ArrayList;

public class Jogador extends JogadorService{
    private ArrayList<Carta> cartasJogador = new ArrayList<>();
    private int pontuacao;
    private int vitorias;

    public Jogador(ArrayList<Carta> cartasJogador, int pontos, int vitorias){
        this.cartasJogador = cartasJogador;
        this.pontuacao = pontos;
        this.vitorias = vitorias;
    }

    public ArrayList<Carta> getCartasJogador() {
        return cartasJogador;
    }

    public void setCartasJogador(ArrayList<Carta> cartasJogador) {
        this.cartasJogador = cartasJogador;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}
