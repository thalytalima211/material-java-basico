public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void verExtrato(){
        System.out.println("=== Extrato da conta corrente ===");
        super.verExtrato();
    }
    
}
