package exaula04;

public class Festa {
    String tema;
    double preco;
    boolean combalao;
    String tamanho;

    public Festa(String tema,double preco, boolean combalao, String tamanho){
        this.tema = tema;
        this.preco = preco;
        this.combalao = true;
        this.tamanho = tamanho;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isCombalao() {
        return combalao;
    }

    public void setCombalao(boolean combalao) {
        this.combalao = combalao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void status (){
        System.out.println("Festa 01");
        System.out.println("tema: " + getTema() );
        System.out.println("preço: " + getPreco());
        System.out.println("com balões: " + isCombalao());
        System.out.println("tamanho: " + getTamanho());
    }

}
