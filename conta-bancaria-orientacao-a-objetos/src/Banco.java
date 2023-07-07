import java.util.ArrayList;

public class Banco {
    public ArrayList<Conta> contas =  new ArrayList<>();
    private String nome;

    public Banco(String nome){
        this.nome = nome;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void verContas(){
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getAgencia() + " - " + conta.getConta());
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
