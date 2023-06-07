public class candidato implements Comparable<candidato> {
    private String nome;
    private int pretensaoSalarial;

    public candidato(String nome, int pretensaoSalarial){
        this.nome = nome;
        this.pretensaoSalarial = pretensaoSalarial;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPretensaoSalarial(){
        return pretensaoSalarial;
    }

    public void setPretensaoSalarial(int pretensaoSalarial){
        this.pretensaoSalarial = pretensaoSalarial;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nPretensão Salarial: R$" + pretensaoSalarial;
    }

    @Override
    public int compareTo(candidato outroCandidato) {
        return Integer.compare(this.pretensaoSalarial, outroCandidato.getPretensaoSalarial());
    }

}

