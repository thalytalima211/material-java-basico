package Reprodutor_Musical;

public class Musica {
    private String duracao;
    private String autor;
    private String titulo;
    private int classificacao;
    private boolean estado;
    
    
    public Musica(String titulo, String autor, String duracao){
        this.titulo = titulo;
        this.autor = autor;
        this.duracao =  duracao;
        this.estado = false;
        this.classificacao = 0;
    }
    
    public Musica(){
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString(){
        return titulo;
    }
}

