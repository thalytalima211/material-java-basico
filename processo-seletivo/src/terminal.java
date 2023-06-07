import java.util.Scanner;

public class terminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao nosso sistema de seleção!");
        System.out.println("Para iniciar, por favor insira quantos candidatos deseja contratar e qual será o salário a ser pago.");
        System.out.print("Quantidade de candidatos a contratar: ");
        int quantidadeSelecionados = scan.nextInt();
        System.out.print("Salário a ser pago, em reais: ");
        int salarioPago = scan.nextInt();


        processoSeletivo selecao = new processoSeletivo(quantidadeSelecionados, salarioPago);
        System.out.println("Processo seletivo inciado!");
        System.out.println("Lembrando que o critério para seleção dos candidatos é baseado em sua pretensão salarial.");

        while(selecao.quantidadeContratados() < quantidadeSelecionados){
            System.out.println("\nMENU:");
            System.out.println("1 - Adicionar candidato");
            System.out.println("2 - Ver entrevistados");
            System.out.println("3 - Ver selecionados");
            System.out.println("4 - Ver lista de espera");
            System.out.println("5 - Ligar para selecionados");
            System.out.println("Escolha uma opção: ");
            int opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Qual o nome do candidato? ");
                    String nome =  scan.next();
                    System.out.print("Qual a pretensão salarial do candidato? ");
                    int pretensaoSalarial = scan.nextInt();
                    selecao.adicionaCandidato(nome, pretensaoSalarial);
                    break;
                case 2:
                    selecao.verEntrevistados();
                    break;
                case 3:
                    selecao.verSelecionados();
                    System.out.println("Esses candidatos receberão um telefonema do nosso RH, se atenderem serão contratados. Senão, o primeiro colocado da lista de espera tomará seu lugar");
                    break;

                case 4:
                    selecao.verListaDeEspera();
                    System.out.println("Aguardando vaga nos selecionados...");
                    break;
                case 5:
                    selecao.ligarParaSelecionados();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente...");
            }
        }
        System.out.printf("Os %d candidatos foram selecionados!\n", quantidadeSelecionados);
        selecao.verContratados();
        System.out.println("Obrigada por usar nosso sistema de seleção!");
    }
}
