package Correio_Telefonico;

public class Contato {
    private long numeroTelefone;
    private String nome;

    public Contato(long numeroTelefone, String nome){
        this.numeroTelefone = numeroTelefone;
        this.nome = nome;
    }

    public Contato(){
    }
    
    public long getNumeroTelefone() {
        return numeroTelefone;
    }
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return nome + " - " + numeroTelefone;
    }
}
