package exaula04;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 {
    Caderno c1 = new Caderno("Cinza",150,2,false,false);
    c1.setQpag(200);
    c1.setaberto(true);
    c1.status();

     System.out.println();
     System.out.println();

    Festa f1 = new Festa("super herois", 400.00,true,"Media" );
    f1.setPreco(200.00);
    f1.status();


        }
    }
}