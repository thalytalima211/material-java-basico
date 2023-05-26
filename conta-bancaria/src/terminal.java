import java.util.Scanner;

public class terminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        sistemaBancario cliente = new sistemaBancario();

        System.out.println("Olá, seja bem-vindo ao New Bank!");
        System.out.print("Para começar, por favor insira seu primeiro nome: ");
        String nome = scan.next();

        System.out.print("Agora digite o seu CPF: ");
        String cpf = scan.next();

        System.out.println("\nInicializando sua conta...\n");
        cliente.criaConta(nome, cpf);

        while(true){
            System.out.printf("Olá %s!\n", nome);
            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Saque");
            System.out.println("4- Consultar dados da conta");
            System.out.println("Digite uma opção: ");
            int opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    cliente.consultaSaldo();
                    break;
                case 2:
                    System.out.print("Qual valor você deseja depositar? ");
                    double valorDeposito = scan.nextDouble();
                    cliente.depositarValor(valorDeposito);
                    break;
                case 3:
                    System.out.println("Qual valor você deseja sacar? ");
                    double valorSaque = scan.nextDouble();
                    cliente.sacarValor(valorSaque);
                    break;
                case 4:
                    cliente.dadosConta();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("\nDeseja realizar mais alguma operação? (1 - SIM)(2 - NÃO)");
            System.out.print("Digite uma opção: ");
            opcao = scan.nextInt();
            if(opcao == 1) continue;
            else if(opcao == 2) break;
            else{
                System.out.println("Opção inválida. Encerrando sessão...");
                break;
            }
        }
        System.out.println("Obrigado por utilizar o New Bank! Tenha um ótimo dia.");
    }
}
