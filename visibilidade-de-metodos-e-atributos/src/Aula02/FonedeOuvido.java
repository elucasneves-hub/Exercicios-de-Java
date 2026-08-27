package Aula02;

public class FonedeOuvido {

    public boolean fechado;
    public boolean conectado;
    public String led;
    public String cor;
    public String entrada;


    public void abrir(){
        fechado = false;
        System.out.println(" fone aberto");
    }
    public void fechar(){
        fechado = true;
        System.out.println(" fone fechado");
    }
    public void conectar(){
        conectado = true;
        System.out.println("conectado");
    }
    public void desconectar(){
        if (conectado == false){
            System.out.println("nao esta conectado a nada para desconectar");
        } else if (conectado = true) {
            conectado = false;
            System.out.println("desconectando ... ...");
        }

    }



}
