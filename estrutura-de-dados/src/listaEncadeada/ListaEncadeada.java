package listaEncadeada;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada=null;
    }

    //o método add adiciona um novo elemento na lista
    //o método abaixo adiciona esse elemento ao final da lista, porém mais a frente será criado um método que adiciona esse elemento em qualquer lugar da lista
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);//é criado um novo nó com o conteúdo dado
        if (this.isEmpty()){
            referenciaEntrada=novoNo;//se a lista estiver vazia, a referencia de entrada na lista receberá agora o novoNo
            return;
        }
        No<T> noAuxiliar =referenciaEntrada;
        for (int i=0;i<this.size()-1;i++){ //esse laço funciona para que o noAuxiliar seja igual ao ultimo elemento da lista
            noAuxiliar=noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);//quando noAuxiliar tem a referencia do ultimo elemento da lista, o método setProximoNo faz com que o novoNo seja adicionado após o noAuxiliar
    }

    //o método get retorna um nó de acordo com um indice informado
    public T get(int index){
        return getNo(index).getConteudo();
    }
    private No<T> getNo (int index){
        validaIndice(index);
        No<T> noAuxiliar=referenciaEntrada;
        No<T> noRetorno=null;
        for (int i=0;i<=index;i++){
            noRetorno = noAuxiliar;
            noAuxiliar=noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    //o método remove exclui um elemento de acordo com um índice informado
    public T remove(int index){
        No<T> noRemovido = this.getNo(index);
        if(index==0){ //se o nó escolhido for o primeiro da fila
            referenciaEntrada=noRemovido.getProximoNo();//a referencia de entrada agora será referente ao segundo nó
            return noRemovido.getConteudo();
        }else{
            No<T> noAnterior=getNo(index-1);
            //a referencia de proximo nó do noAnterior agora será o nó sucessor ao nó que será removido
            //dessa forma, o noRemovido não faz mais parte da fila pois não há nenhuma referencia a ele, referencia essa que estava no noAnterior
            noAnterior.setProximoNo(noRemovido.getProximoNo());
            return noRemovido.getConteudo();
        }
    }

    //o método size retorna o tamanho da lista
    public int size(){
        int tamanhoLista=0; //a lista inicia em 0
        No<T> referenciaAux = referenciaEntrada;
        while ((true)){
            if(referenciaAux!=null){
                tamanhoLista++; //se a referencia auxiliar não for nula, indica que há mais elementos na lista, logo, mais um é adicionado ao contador tamanhoLista
                if (referenciaAux.getProximoNo()!=null){ //se o proximo nó não for nulo, o loop continua
                    referenciaAux=referenciaAux.getProximoNo(); //se o proximo nó não for nulo, o nó referenciaAux passa então a receber a sua referencia
                }else break; //se o proximo nó for nulo, o loop quebra
            }else break;
        }
        return tamanhoLista;
    }


    //esse métoda valida o indice inseridos. Se eles forem superiores aos suportados, o código estoura um erro
    private void validaIndice(int index){
        if (index>=size()) throw new IndexOutOfBoundsException("Não existe conteúdo no índice "+index+" dessa lista. Esta lista só vai até o índice "+(size()-1));
    }

    public boolean isEmpty(){
        if(referenciaEntrada==null) return true;
        else return false;
    }

    @Override
    public String toString(){
        String strRetorno="";
        No<T> noAuxiliar=referenciaEntrada;
        for(int i=0;i<this.size();i++){
            strRetorno+="[No{conteudo="+noAuxiliar.getConteudo()+"}]--->";
            noAuxiliar=noAuxiliar.getProximoNo();
        }
        strRetorno+="null";
        return strRetorno;
    }
}