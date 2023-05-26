import java.util.Random;

public class sistemaBancario{
    Random aleatorio = new Random();
    String cliente = null;
    String cpf;
    int agencia;
    String conta = null;
    double saldo = 0;

    public void criaConta(String nomeCliente, String cpfCliente){
        this.cliente = nomeCliente;
        this.cpf = cpfCliente;;
        this.agencia = aleatorio.nextInt(9999-1000+1)+1000;
        int inicioConta = aleatorio.nextInt(99999-10000+1)+10000, digito=aleatorio.nextInt(9);
        this.conta = inicioConta + "-" + digito;
    }

    public void dadosConta(){
        System.out.printf("Olá %s! Seu CPF cadastrado é %s. Sua agência em nosso banco é %d e sua conta é %s", cliente, cpf, agencia, conta);
    }

    public void consultaSaldo(){
        System.out.printf("%s, seu saldo é R$%.2f", cliente, saldo);
    }

    public void depositarValor(double valor){
        this.saldo += valor;
        System.out.println("Depósito concluido!");
    }

    public void sacarValor(double valor){
        if(this.saldo < valor) System.out.println("Saldo insuficiente!");
        else{
            this.saldo -= valor;
            System.out.println("Saque efetuado!");
        }
    }

}