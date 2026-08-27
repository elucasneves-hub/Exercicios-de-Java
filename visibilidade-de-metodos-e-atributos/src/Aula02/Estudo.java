package Aula02;

public class Estudo {
    public int tempo;
    private boolean comcafe;
    protected boolean comagua;
    public boolean pelocelular;
    public boolean pelopc;
    public String conteudo;

    public void pegaragua(){
        System.out.println("pegando agua");
        comagua = true;
    }
    public void pergarcafe(){
        System.out.println("pegando café");
        comcafe = true;
    }
    public void celular(){
        pelocelular = true;
        pelopc = false;
        System.out.println("estudo pelo celular");
    }
    public void pc (){
        pelopc = true;
        pelocelular = false;
        System.out.println("estudo pelo PC ");
    }
    public void cntd(){
        if (conteudo.equals("Matematica") ){
            pelocelular = true;
            pelopc = false;
            System.out.println("estudando pelo celular matematica");
        }else {
            System.out.println("conteudo a estudar " + this.conteudo);
        }
    }
}
