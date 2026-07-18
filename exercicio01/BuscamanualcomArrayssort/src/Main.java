import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int vet[]= {2,7,8,5,9,4,77};
        Arrays.sort(vet);
        for (int c=0; c < vet.length; c++) {
            if ( vet[c] %  2 == 0) {
                System.out.println("na posição " + c + "temos " + vet[c] +  " que é par " ) ;
            }
        }
    }
}