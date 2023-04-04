import java.util.Scanner;

public class Exercicio2_laco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.print("Insira sua nota:");
        nota = entrada.nextInt();
        while (nota<0 || nota>10){
            System.out.print("Valor inválido, tente novamente. Insira sua nota:");
            nota = entrada.nextInt();
        }
        System.out.println("Sua nota foi "+nota);
    }
}
