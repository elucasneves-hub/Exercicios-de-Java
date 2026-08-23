//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 {

     int totimpares =0;
     int totpares=0;
     int vet[]={0,3,4,5,3};
     for (int cc=0; cc< vet.length; cc++){
         if (vet[cc] % 2 ==0){
             totpares++;
         }
         if (vet[cc] % 2 != 0){
             totimpares++;
         }
     }
     System.out.println("total de pares é de " + totpares);
     System.out.println("total de impares é de " + totimpares);

        }
    }
}