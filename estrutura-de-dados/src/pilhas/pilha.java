package pilhas;

//uma pilha é caracterizada pela sigla LIFO(Last In, First Out), ou seja, o ultimo elemento a entrar será o primeiro a sair
//essa comparação é semelhante a uma pilha de livros
public class pilha {
    private no refNoEntradaPilha;

    // quando uma pilha inicia varia, sua referencia de entrada é nula, pois não há elementos
    public pilha() {
        this.refNoEntradaPilha = null;
    }

    //o método push adiciona um novo elemento a pilha, nesse caso, um novo nó
    public void push(no novoNo) {
        no refAuxiliar = refNoEntradaPilha; //o nó referencia auxiliar recebe o valor de referencia do topo da fila
        refNoEntradaPilha = novoNo;//a referencia do topo da fila agora é direcionada ao novo elemento que foi adicionado no topo
        refNoEntradaPilha.setRefNo(refAuxiliar);//a referencia do novo nó é a antiga referêcia de topo
    }

    //o método pop remove o ultimo elemento adicionado a pilha e o retorna
    public no pop() {
        //se a pilha não estiver vazia
        if (!this.isEmpty()) {
            no noPoped = refNoEntradaPilha; //o nó removido será aquele que é apontado pela referencia de topo
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); //a referencia de topo agora tem o nó anterior ao removido
            return noPoped; //o método retorna o nó removido
        }
        return null; //se a pilha estiver vazia o método retorna null
    }


    //o metodo top retorna a referencia do topo da pilha
    public no top() {
        return refNoEntradaPilha;
    }

    //o método isEmpty informa se a pilha está vazia ou não
    public boolean isEmpty() {
        if (refNoEntradaPilha == null) return true;
        return false;
    }

    @Override
    public String toString(){
        String stringRetorno="------------\n";
        stringRetorno+= "   Pilha\n";
        stringRetorno+="------------\n";

        no noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar!=null){
                stringRetorno+="[No{dado="+noAuxiliar.getDado()+"}]\n";
                noAuxiliar=noAuxiliar.getRefNo();
            }else{
                break;
            }
        }

        stringRetorno+="------------\n";
        return stringRetorno;
    }

}



