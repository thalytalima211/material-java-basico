/*Exercício: Crie um laço que recebe o nome e a idade de uma pessoa. Esse laço encerra quando o campo Nome recebe o valor 0 */
import java.util.Scanner;

public class Exercicio1_laco {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade ;

        while (true){
            System.out.print("Nome:");
            nome = entrada.next();
            if (nome.equals("0")){
                System.out.println("Programa encerrado");
                break;
            }
            System.out.print("Idade:");
            idade = entrada.nextInt();
        }

    }
}
