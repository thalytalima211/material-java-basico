public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("ThalytaBank");
        Cliente Thalyta =  new Cliente("Thalyta");

        Conta cc = new ContaCorrente(Thalyta, banco);
        Conta cp = new ContaPoupanca(Thalyta, banco);
        banco.verContas();

        cc.depositar(100);

        cc.verExtrato();
        cp.verExtrato();

        cc.depositar(50);
        cc.transferir(150, cp);
        cp.sacar(25);

        cc.verExtrato();
        cp.verExtrato();
    }
}
