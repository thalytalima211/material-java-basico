package listaCircular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda=null;
        this.cabeca=(null);
        this.tamanhoLista=0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if (this.isEmpty()) throw new IndexOutOfBoundsException("A lista está vazia");
        if (index==0){
            return this.cauda;
        }else{
            No<T> noAuxiliar=this.cauda;
            for(int i=0;(i<index)&&(noAuxiliar!=null);i++){
                noAuxiliar=noAuxiliar.getNoProximo();
            }
            return noAuxiliar;
        }
    }

    public void remove(int index){
        if (index>=this.tamanhoLista) throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");
        No<T> noAuxiliar=this.cauda;
        if(index==0){//se o indice for 0, queremos remover o elemento da cauda
            this.cauda=this.cauda.getNoProximo(); //a cauda agora passa a ser o segundo elemento da lista
            this.cabeca.setNoProximo(this.cauda); //a cabeça, que apontava para a antiga cauda, agora aponta para a nova cauda
            //dessa forma foram removidas todas as referencias ao antigo nó que estava na cauda
        } else if (index==1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
            //a referencia de proximo nó da cauda será o nó de indice 2, removendo a referencia ao antigo nó de indice 1
            //o caso para indice=1 é excepcional pois devemos atualizar o nó cauda para uso em outros metodos
        } else{
            for(int i=0;i<index-1;i++){
                noAuxiliar=noAuxiliar.getNoProximo();//o noAuxiliar será o nó anterior ao que queremos remover pois o loop para em index-1
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
            //a referencia do noAuxiliar será o nó de index+1, removendo a referencia para o nó em index
        }
        this.tamanhoLista--;
    }

    //o método add adiciona um elemento no inicio da lista circular
    public void add(T conteudo){
        No<T> novoNo=new No<>(conteudo);
        if (this.isEmpty()){ //se a lista estiver vazia
            this.cabeca=novoNo; //a cabeça da lista será o novoNo
            this.cauda=this.cabeca; //a cauda será igual a cabeça, ou seja, igual ao novoNo
            this.cabeca.setNoProximo(cauda);//a cabeça irá apontar para a cauda da lista, formando a lista ciruclar
        }else{
            novoNo.setNoProximo(this.cauda); //o novoNo apontará para o antigo nó da cauda
            this.cabeca.setNoProximo(novoNo); //a cabeça da lista apontará para o novoNo
            this.cauda=novoNo; //a cauda da lista agora será o novoNo
        }
        this.tamanhoLista++;
    }

    public void add(int index,T conteudo){
        No<T> noAuxiliar= getNo(index-1);
        No<T> novoNo= new No<>(conteudo);
        if (index == 0){
             add(conteudo);
        }
        if(index==1){
            novoNo.setNoProximo(noAuxiliar.getNoProximo());
            this.cauda.setNoProximo(novoNo);
        }else{
            novoNo.setNoProximo(noAuxiliar.getNoProximo());
            noAuxiliar.setNoProximo(novoNo);
        }
        this.tamanhoLista++;
    }

    public boolean isEmpty(){
        if (tamanhoLista==0) return true;
        else return false;
    }

    @Override
    public String toString(){
        String strRetorno="";
        No<T> noAuxiliar=this.cauda;
        for(int i=0;i<this.size();i++){
            strRetorno+="[No{conteudo="+noAuxiliar.getConteudo()+"}]--->";
            noAuxiliar=noAuxiliar.getNoProximo();
        }
        if (isEmpty()) strRetorno+="[]";
        else strRetorno+="Retorna ao início";

        return strRetorno;
    }
}
