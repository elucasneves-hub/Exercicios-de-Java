import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {{

        Scanner tec= new Scanner(System.in);
        double media=0;
        double somanotas=0;
        int qAprovados=0;
        int qReprovados=0;
        double vet []= new double[6];
        for (int cc=0; cc<6; cc++){
            System.out.println("digite a nota " + cc );
            vet[cc] = tec.nextInt();
            somanotas = somanotas + vet[cc];
            if (vet[cc] <6){
                System.out.println("reprovado");
                qReprovados++;
            } else if (vet[cc] >=6) {
                System.out.println("aprovado");
                qAprovados++;
            }
        }
        System.out.println(" a quantidade de alunos aprovados é de " + qAprovados);
        System.out.println(" a quantidade de reprovados é de " + qReprovados);
        media = (somanotas / vet.length);
        System.out.println(" a soma as notas é de " + somanotas);
        System.out.println(" a media da turma é de "+ media );

        }
    }
}