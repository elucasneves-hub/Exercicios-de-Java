import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 {

     int qn= 0;
     int soma=0;
     int resp ;
     Scanner tec = new Scanner(System.in);
     int vet []= new int [5];
     for (int cc=0; cc<=4; cc++){
         System.out.println("preencha o vetor ");
         vet[cc] = tec.nextInt();
     }
     for (int cc =0; cc<=4; cc++){
         soma = (soma + vet[cc]);
         qn++;
     }
     System.out.println(soma);
     System.out.println(soma / qn );
        }
    }
}