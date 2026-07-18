import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int vetor[]= {2,7,8,5,9,4,77};
        Arrays.sort(vetor);
        for (int c=0; c < vetor.length; c++) {
            if ( vetor[c] %  2 == 0) {
                System.out.println("na posição " + c + "temos " + vetor[c] +  " que é par " ) ;
            }
        }
    }
}