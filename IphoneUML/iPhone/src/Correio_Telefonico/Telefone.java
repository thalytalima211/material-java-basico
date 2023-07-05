package Correio_Telefonico;

import java.util.Scanner;
import java.util.ArrayList;;

public class Telefone implements CorreioTelefonico{
    Scanner entrada =  new Scanner(System.in);
    private ArrayList<Contato> meusContatos = new ArrayList<Contato>();
    private ArrayList<Contato> favoritos = new ArrayList<Contato>();

    public void fazLigacao(){
        System.out.print("Digite um número (apenas números): ");
        long numero = entrada.nextLong();
        System.out.println("Ligando para " + numero);
    }

    public void ouvirCorreioDeVoz(){
        System.out.println("Você não tem novos recados...");
    }

    public void atenderLigacao(){
        System.out.println("Atendendo ligação...");
    }

    public void rejeitarLigacao(){
        System.out.println("Rejeitando ligação...");
    }

    public void salvarContato(){
        System.out.print("Digite o nome do contato: ");
        String nome = entrada.next();
        System.out.printf("Qual o número de telefone do(a) %s: ", nome);
        long numeroTelefone = entrada.nextLong();
        Contato novoContato = new Contato(numeroTelefone, nome);
        meusContatos.add(novoContato);
        System.out.println("\nContato adicionado!");
    }

    public void verContatos(){
        if(meusContatos.size() == 0) System.out.println("Sem contatos na lista! Adicione um novo contato!");
        else for(int i = 0; i < meusContatos.size(); i++) System.out.println(meusContatos.get(i));
    }

    public void vivaVoz(){
        System.out.println("Chamada no viva-voz...");
    }

    private Contato buscarContato(ArrayList<Contato> contatos, String nome){
        for (Contato contato : contatos) {
            if(contato.getNome().equals(nome)) return contato;
        }
        return null;
    }

    public void adicionarFavorito(){
        System.out.print("Quem você quer adicionar aos favoritos? ");
        String nome = entrada.nextLine();
        if(buscarContato(meusContatos, nome) == null) System.out.println("Esse nome não existe nos contatos!");
        else{
            favoritos.add(buscarContato(meusContatos, nome));
            System.out.printf("%s adicionado(a) aos favoritos!", buscarContato(meusContatos, nome).getNome());
        }
    }

    public void verFavoritos(){
        if(favoritos.size() == 0) System.out.println("Não há contatos nos favoritos!");
        else for (int i = 0; i < favoritos.size(); i++) System.out.println(favoritos.get(i));
    }

    public void verLigacoesPerdidas(){
        System.out.println("Não há ligações perdidas!");
    }

    public void verLigacoesRecentes(){
        System.out.println("Não há ligações recentes!");
    }

    public void enviarSMS(){
        System.out.print("Para quem você deseja enviar um SMS? ");
        String nome = entrada.next();
        if(buscarContato(meusContatos, nome) == null) System.out.println("Esse nome não existe nos contatos!");
        else{
            System.out.print("Digite a mensagem: ");
            String mensagem = entrada.next();
            System.out.println("Mensagem enviada!");
        }
    }
}
