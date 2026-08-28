package exaula04;

public class Caderno {
    private String cor;
    private int qpag;
    private int tamanho;
    private boolean escrevendo;
    private boolean aberto;

    public Caderno(String cor,int qpag, int tamanho,boolean escrevendo,boolean aberto) {
        this.cor =cor;
        this.qpag = qpag;
        this.tamanho = tamanho;
        this.escrevendo = escrevendo;
        this.aberto = aberto;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQpag() {
        return qpag;
    }

    public void setQpag(int qpag) {
        this.qpag = qpag;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isEscrevendo() {
        return escrevendo;
    }

    public void setEscrevendo(boolean escrevendo) {
        this.escrevendo = escrevendo;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setaberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void status (){
        System.out.println(" Caderno 01");
        System.out.println("cor: " + getCor() );
        System.out.println("quantidade de páginas: " + getQpag());
        System.out.println("tamanho: " + getTamanho());
        System.out.println("escrevendo: " + isAberto());
        System.out.println("aberto: " + isAberto());
    }

}
