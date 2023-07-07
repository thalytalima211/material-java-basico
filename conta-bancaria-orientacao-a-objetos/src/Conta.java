public abstract class Conta {
    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    private int agencia;
    private int conta;
    private double saldo;
    private Cliente cliente;
    private Banco banco;
    
    
    public Conta(Cliente cliente, Banco banco){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
        banco.adicionarConta(this);
    }
    
    public Banco getBanco() {
        return banco;
    }

    public int getAgencia() {
        return agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public int getConta() {
        return conta;
    }

    public void sacar(float valor){
        this.saldo -= valor;
    }

    public void depositar(float valor){
        this.saldo += valor;
    }

    public void transferir(float valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
    }

    public void verExtrato(){
        System.out.printf("Banco: %s\n", this.banco.getNome());
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agência: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.conta);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }

}
