package Aula02;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 {
     FonedeOuvido fone1 = new FonedeOuvido();
     fone1.cor = "branco";
     fone1.entrada = "USB";
     fone1.conectado=true;
     fone1.fechado=true;
     System.out.println(" objeto Fone de Ouvido");
     fone1.abrir();
     fone1.conectar();
     fone1.desconectar();
     fone1.fechar();

     System.out.println();
     System.out.println();

     Estudo estudodd = new Estudo();
     estudodd.pelopc=false;
     estudodd.pelocelular=true;
     estudodd.conteudo="Matematica";
    // estudodd.comcafe=true;
     estudodd.comagua=true;
     estudodd.tempo=2;
     System.out.println("objeto Estudo ");
     estudodd.celular();
     estudodd.cntd();
     estudodd.pergarcafe();


        }
    }
}