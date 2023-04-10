package Baralho;

public class Carta {
    private String naipe;
    private String valor;
    private int pontos;


    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Carta(String valor, String naipe, int pontos){
        this.valor = valor;
        this.naipe = naipe;
        this.pontos = pontos;
    }

    public String toString(){
        return (valor + " de " + naipe);
    }
    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
