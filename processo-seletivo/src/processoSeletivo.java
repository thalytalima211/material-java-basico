import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class processoSeletivo {
    int quantidadeSelecionados;
    int salarioPago;
    ArrayList<candidato> entrevistados = new ArrayList<candidato>();
    ArrayList<candidato> selecionados =  new ArrayList<candidato>();
    ArrayList<candidato> listaDeEspera = new ArrayList<candidato>();
    ArrayList<candidato> contratados = new ArrayList<candidato>();

    public void iniciaProcessoSeletivo(int quantidadeSelecionados, int salarioPago){
        this.quantidadeSelecionados = quantidadeSelecionados;
        this.salarioPago = salarioPago;
    }

    public void adicionaCandidato(String nome, int pretensaoSalarial){
        candidato novoCandidato = new candidato(nome, pretensaoSalarial);
        entrevistados.add(novoCandidato);
        if((novoCandidato.getPretensaoSalarial() <= salarioPago) && (selecionados.size() < quantidadeSelecionados)){
           selecionados.add(novoCandidato); 
           Collections.sort(selecionados);
        } 
        else {
            listaDeEspera.add(novoCandidato);
            Collections.sort(listaDeEspera);
        }
        System.out.println("Candidato adicionado!");
    }

    public void verEntrevistados(){
        if(entrevistados.size() == 0) System.out.println("Não há candidatos nessa etapa de seleção!");
        else{
            System.out.println("Os entrevistados, do primeiro ao último entrevistado, são:");
            for(int i = 0 ; i < entrevistados.size(); i++){
                System.out.println((i + 1) + "º - " + entrevistados.get(i).toString());
            }
        }
    }

    public void verSelecionados(){
        if(selecionados.size() == 0) System.out.println("Não há candidatos nessa etapa de seleção!");
        else{
            System.out.println("Os candidatos selecionados, de acordo com sua pretensão salarial, foram:");
            for(int i = 0; i < selecionados.size(); i++){
                System.out.println((i + 1) + "º - " + selecionados.get(i).toString());
            }
        }
    }

    public void verListaDeEspera(){
        if(listaDeEspera.size() == 0) System.out.println("Não há candidatos nessa etapa de seleção!");
        else{
            System.out.println("Os candidatos na lista de espera, de acordo com sua pretensão salarial, foram:");
            for(int i = 0; i < listaDeEspera.size(); i++){
                System.out.println((i + 1) + "º - " + listaDeEspera.get(i).toString());
            }
        }
    }

    public void ligarParaSelecionados(){
        if(selecionados.size() == 0) System.out.println("Não há nenhum candidato selecionado!");
        else{
            System.out.printf("Tentando contato com %s, o primeiro colocado nos selecionados...\n", selecionados.get(0).getNome());
            int tentativasRealizadas = 0;
            boolean continuarTentando = true;
            boolean atendeu = false;
            boolean contatoSucedido = false;
            while(continuarTentando && tentativasRealizadas < 3) {
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando) tentativasRealizadas++;
                else contatoSucedido = true;
            }
            if(contatoSucedido){
                System.out.printf("O candidato %s atendeu a ligação e foi contratado!\n", selecionados.get(0).getNome());
                contratados.add(selecionados.get(0));
                selecionados.remove(0);
                selecionados.add(listaDeEspera.get(0));
                listaDeEspera.remove(0);
            }else{
                System.out.printf("O candidato %s não atendeu a ligação e foi desclassificado!", selecionados.get(0).getNome());
                selecionados.remove(0);
                selecionados.add(listaDeEspera.get(0));
                listaDeEspera.remove(0);
            }
        }
    }

    public void verContratados(){
        System.out.println("Os contratados foram:");
        for(int i = 0 ; i < contratados.size(); i++){
            System.out.println((i + 1) + "º - " + contratados.get(i).toString());
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
}