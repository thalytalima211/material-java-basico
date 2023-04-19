package listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        primeiroNo=null;
        ultimoNo=null;
        this.tamanhoLista=0;
    }

    //o método add adiciona um elemento ao final da lista
    public void add(T elemento){
        NoDuplo<T> novoNo =new NoDuplo<>(elemento); //cria um novo no com o elemento dado pelo método
        novoNo.setNoPosterior(null);//o nó posterior do novoNo será nulo porque ele foi adicionado ao final da lista
        novoNo.setNoAnterior(ultimoNo); //o no anterior do novoNo será o antigo ultimo nó da lista
        if (primeiroNo==null){
            primeiroNo=novoNo;//se o primeiro nó for nulo, a lista estará vazia e o novoNo será então o primeiro elemento dela
        }
        if (ultimoNo!=null){
            ultimoNo.setNoPosterior(novoNo); //o nó posterior do ultimoNo da lista será agora o novoNo adicionado
        }
        ultimoNo=novoNo; //o novoNo agora será o ultimo nó da lista
        tamanhoLista++; //o tamanho da lista aumenta em uma unidade indicando a adição desse elemento
    }

    //o método add(index,elemento) adiciona um elemento em um determinado indice da lista
    public void add(int index,T elemento){
        NoDuplo<T> noAuxiliar = getNo(index); //o noAuxiliar recebe o nó que tem o indice dado
        NoDuplo<T> novoNo = new NoDuplo<>(elemento); //o novoNo é criado, com o elemento dado
        novoNo.setNoPosterior(noAuxiliar); //o nó posterior ao novoNo será o noAuxiliar, pois o novoNo será colocado em seu lugar
        if(novoNo.getNoPosterior()!=null){ //se o nó posterior não for nulo, o nó está no meio da lista
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior()); //o nó anterior do novoNo será será o antigo nó anterior do noAuxiliar
            novoNo.getNoPosterior().setNoAnterior((novoNo));
            //o nó anterior do nó posterior de novoNo(ou seja, do noAuxiliar, linha 33) será o novoNo
            //ou seja, o nó posterior ao novoNo apontará para ele
        }else{ //se o nó posterior for nulo, significa que o novoNo será adicionado ao final da fila
            novoNo.setNoAnterior(ultimoNo); //o nó anterior no novoNo será o antigo ultimoNo da fila
            ultimoNo=novoNo; //o ultimo nó da fila agora será o novoNo
        }
        if(index==0){ //se o indice for 0 o novoNo estará no inicio da lista
            primeiroNo=novoNo; //o primeiro nó da lista agora será o novoNo
        }else{
            novoNo.getNoAnterior().setNoPosterior(novoNo);
            //se o novoNo não estiver no inicio da lista, o no anterior ao novoNo apontará para ele
        }
        tamanhoLista++; //o tamanho da lista aumenta em uma unidade indicando a adição desse elemento
    }

    //o método remove remove um elemento dado seu índice
    public void remove(int index){
        if(index==0) { //se o elemento escolhido for o primeiro
            primeiroNo=primeiroNo.getNoPosterior(); //o primeiro nó agora receberá o segundo nó
            if(primeiroNo!=null){ //se houver um segundo nó na lista
                primeiroNo.setNoAnterior(null); //o primeiro nó receberá a referencia de nó anterior nula, pois está no inicio da fila
                //essa operação exclui todas as referencias ao antigo primeiroNoqq
            }
        }else{
            NoDuplo<T> noAuxiliar =getNo(index); //o noAuxiliar será o nó a ser removido
            noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());
            //a referencia de nó posterior do nó anterior ao noAuxliar será o nó posterior ao noAuxiliar
            //eliminando a referencia que havia ao noAuxiliar no nó anterior
            if (noAuxiliar!=ultimoNo){ //se o noAuxiliar não for o ultimo nó da lista
                noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
                //a referencia de nó anterior do nó posterior ao noAuxiliar será o nó anterior ao noAuxiliar
                //eliminando a referencia que havia ao noAuxiliar no nó posterior
            }else{
                ultimoNo=noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar= primeiroNo;
        for(int i=0;(i<index)&&(noAuxiliar!=null);i++){
            noAuxiliar=noAuxiliar.getNoPosterior();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString(){
        String strRetorno="";
        NoDuplo<T> noAuxiliar=primeiroNo;
        for(int i=0;i<size();i++){
            strRetorno+="[No{conteudo="+noAuxiliar.getConteudo()+"}]--->";
            noAuxiliar=noAuxiliar.getNoPosterior();
        }
        strRetorno+="null";
        return strRetorno;
    }
}
