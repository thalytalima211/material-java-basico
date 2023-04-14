package projeto_no;

public class no<T> {
    private T conteudo;
    private no<T> proximoNo;

    public no(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public no<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(no<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "no{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
