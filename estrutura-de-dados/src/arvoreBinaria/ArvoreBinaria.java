package arvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
    private NoBin<T> raiz;

    public ArvoreBinaria(){
        this.raiz=null;
    }

    public void inserir(T conteudo){
        NoBin<T> novoNo = new NoBin<>(conteudo);
        raiz=inserir(raiz,novoNo);
        //se a raiz for nula, o uso do método inserir faz com que ela se torne igual ao novoNo. Se não, ela continua com o mesmo valor
    }

    //o método abaixo é um método recursivo, pois utiliza dele mesmo repetidas vezes até que seja alcançado um objetivo
    //nesse caso, o método faz sucessivos usos dele mesmo, passando o novoNo para a direita ou esquerda, até que esse pare em uma referencia de nó nula
    private NoBin<T> inserir(NoBin<T> atual, NoBin<T> novoNo){
        if (atual==null){
            return novoNo; //quando o método acha uma referencia de nó nulo ele para e atribui essa referencia ao novoNo
        } else if(novoNo.getConteudo().compareTo(atual.getConteudo())<0){
            //o método compareTo vem da interface Comparable, e retorna -1 quando o primeiro for menor,
            //0 quando forem iguais e 1 quando o primeiro for maior
            atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));
            //se o novoNo é menor que o nó que está sendo comparado ele vai para o nó da esquerda
            //esse processo para quando não houver mais nó a esquerda, ou seja, quando este for nulo
        }else{
            atual.setNoDir(inserir(atual.getNoDir(),novoNo));
            // se o novoNo é maior ou igual que o nó que está sendo comparado ele vai para o nó da direita
            //esse processo para quando não houver mais nó a direita, ou seja, quando este for nulo
        }
        return atual; //se o método não usa um nó nulo, então o nó usado continuara com seu mesmo valor, simbolizado aqui por "atual"
    }


    //a exibição InOrdem coloca os elementos em ordem crescente
    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoBin<T> atual){
        if (atual!=null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo()+",");
            exibirInOrdem(atual.getNoDir());
            //o passo a passo da condicional roda
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoBin<T> atual){
        if (atual!=null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo()+",");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoBin<T> atual){
        if (atual!=null){
            System.out.println(atual.getConteudo()+",");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public void remover(T conteudo){
        try {
            NoBin<T> atual=this.raiz;
            NoBin<T> pai=null;
            NoBin<T> filho=null;
            NoBin<T> temp=null;
            while(atual!=null && !atual.getConteudo().equals(conteudo)){
                pai=atual;
                if(conteudo.compareTo(atual.getConteudo())<0){
                    atual=atual.getNoEsq();
                }else{
                    atual=atual.getNoDir();
                }
            }
            if (atual==null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }
            if(pai==null){ //pai terá conteúdo nulo se o laço while acima não rodar, caso em que o conteudo removido está na raiz
                if(atual.getNoEsq()==null){
                    this.raiz=atual.getNoEsq();
                }else if(atual.getNoDir()==null){
                    this.raiz=atual.getNoDir();
                }else{
                    for(temp=atual,filho=atual.getNoEsq();filho.getNoDir()!=null;temp=filho,filho=filho.getNoEsq()){
                        if(filho!=atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz=filho;
                }
            }else if(atual.getNoDir()==null){
                if(pai.getNoEsq()==atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else{
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq()==null){
                if(pai.getNoEsq()==atual){
                    pai.setNoEsq(atual.getNoDir());
                }else{
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                for(temp=atual,filho=atual.getNoEsq();filho.getNoDir()!=null;temp=filho,filho=filho.getNoDir()){
                    if(filho!=atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq()==atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }
}
