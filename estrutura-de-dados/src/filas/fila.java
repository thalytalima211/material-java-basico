package filas;

public class fila<T> {
    private no<T> refNoEntradaFila;

    //quando uma fila é iniciada, a referencia de entrada é nula
    public fila() {
        this.refNoEntradaFila=null;
    }

    //o método enqueue adiciona um novo elemento ao final da fila
    public void enqueue(T obj){
        no novoNo =new no(obj);
        novoNo.setRefNo(refNoEntradaFila); //a referencia de nó do novo nó que foi adicionado será a referencia do final da fila
        refNoEntradaFila=novoNo; //a referencia do final da fila será agora a referencia para o ultimo nó que foi adicionado
    }

    //o metodo first retorna o primeiro elemento adicionado na lista
    public T first(){
        if(!this.isEmpty()){ //o processamento roda se a lista não estiver vazia
           no primeiroNo=refNoEntradaFila; //o no auxiliar "primeiroNo" recebe a referencia do ultimo elemento da lista
           while (true){
               if(primeiroNo.getRefNo()!=null){
                   primeiroNo=primeiroNo.getRefNo();
                   //se a referencia não for nula, o primeiroNo recebe então a referencia do no que está a sua frente
                   //até que se torne realmente o primeiro nó da fila
               }else{
                   break;
                   //se essa referencia for nula, significa que não há mais elementos a frente de primeiroNo
                   //logo, o primeiroNo realmente é o primeiro dessa lista
               }
           }
           return (T) primeiroNo.getObject();
        }
        return null; //se a lista estiver vazia, o método first retorna null
    }

    //o metodo dequeue remove o primeiro elemento da lista
    public T dequeue(){
        if(!this.isEmpty()){ //o processamento roda se a lista não estiver vazia
            no primeiroNo=refNoEntradaFila; //esse nó irá procurar o primeiro nó, que será removido
            no noAuxiliar=refNoEntradaFila; //esse nó armazenará o segundo nó da lista, que será o primeiro após a remoção
            while(true){
                if(primeiroNo.getRefNo()!=null){
                    noAuxiliar=primeiroNo; //o noAuxiliar será igual ao primeiroNo
                    primeiroNo=primeiroNo.getRefNo(); //logo após, o primeiroNo será igual ao nó que está a sua frente
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                    //quando o primeiroNo encontrar a referencia de nó nula, ou seja, quando chegar ao inicio da fila
                    //o noAuxiliar então poderá receber a referencia de nó nula, se tornando o primeiro nó da fila
                }
            }
            return (T) primeiroNo.getObject(); //o método retorna o primeiro nó da fila e depois o remove, tornando o noAuxiliar o novo primeiro nó da fila
        }
        return null; //se a lista estiver vazia, o método enqueue retorna null
    }

    public boolean isEmpty(){
        if (refNoEntradaFila==null) return true;
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno="";
        no noAuxiliar=refNoEntradaFila; //o noAuxiliar recebe a referencia do final da fila
        if (refNoEntradaFila!=null){
            while(true){
                stringRetorno+="[No{objeto="+noAuxiliar.getObject()+"}]--->"; //printa o final da fila
                if(noAuxiliar.getRefNo()!=null){ //se o proximo nó não for nulo
                    noAuxiliar=noAuxiliar.getRefNo(); //o noAuxiliar recebe o proximo nó
                }else{
                    stringRetorno+="null"; //se o proximo nó for nulo, chegamos ao final da fila e o loop quebra
                    break;
                }
            }
        }else{
            stringRetorno="null";
        }
        return stringRetorno;
    }

}
