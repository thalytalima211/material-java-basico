public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void verExtrato(){
        System.out.println("=== Extrato da conta poupança ===");
        super.verExtrato();
    }
    
}
