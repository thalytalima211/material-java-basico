import java.util.Random;

public class sistemaBancario{
    Random aleatorio = new Random();
    private String cliente = null;
    private String cpf;
    private int agencia;
    private String conta = null;
    private double saldo = 0;

    public sistemaBancario(String nomeCliente, String cpfCliente){
        cliente = nomeCliente;
        cpf = cpfCliente;;
        agencia = aleatorio.nextInt(9999-1000+1)+1000;
        int inicioConta = aleatorio.nextInt(99999-10000+1)+10000, digito = aleatorio.nextInt(9);
        conta = inicioConta + "-" + digito;
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