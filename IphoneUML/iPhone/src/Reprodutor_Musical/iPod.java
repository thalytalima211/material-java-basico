package Reprodutor_Musical;

import java.util.ArrayList;
import java.util.Scanner;

public class iPod implements ReprodutorMusical{
    Scanner entrada =  new Scanner(System.in);
    private ArrayList<Musica> minhasMusicas = new ArrayList<Musica>();
    private Musica musicaAtual;

    public void adicionarMusica(){
        System.out.print("Qual o nome da música? ");
        String nome = entrada.nextLine();
        System.out.print("Quem é seu autor? ");
        String autor = entrada.nextLine();
        System.out.print("Qual sua duração? (Formato x:xx) ");
        String duracao = entrada.nextLine();
        Musica novaMusica = new Musica(nome, autor, duracao);
        minhasMusicas.add(novaMusica);
        this.musicaAtual = novaMusica;
        musicaAtual.setEstado(true);
        System.out.println("Música adicionada!");
    }

    public void play(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else if(musicaAtual.isEstado()) System.out.printf("A música %s já está sendo reproduzida", musicaAtual.getTitulo());
        else{
            musicaAtual.setEstado(true);
            System.out.println("Tocando música...");
        }
    }

    public void pause(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else if(!musicaAtual.isEstado()) System.out.printf("A música %s já está pausada", musicaAtual.getTitulo());
        else{
            musicaAtual.setEstado(false);
            System.out.println("Pausando música...");
        }
    }

    public void verMusicas(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else for (Musica musica : minhasMusicas) System.out.printf("%s (%s)\n", musica.getTitulo(), musica.getAutor());
    }

    public void verArtistas(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else for (Musica musica : minhasMusicas) System.out.println(musica.getAutor());
    }

    public void diminuiVolume(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else if(!musicaAtual.isEstado()) System.out.println("A música atual está pausada!"); 
        else System.out.println("Diminuindo volume...");
    }

    public void aumentaVolume(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else if(!musicaAtual.isEstado()) System.out.println("A música atual está pausada!"); 
        else System.out.println("Aumentando volume...");
    }


    public void classificarMusica(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else{
            System.out.print("Digite uma classificação de 1 a 5 para a música que está sendo reproduzida: ");
            int classificacao = entrada.nextInt();
            musicaAtual.setClassificacao(classificacao);
            System.out.printf("Música classificada com a nota %d!\n", classificacao);
        }
    }
    
    private Musica buscarMusica(String nome){
        for (Musica musica : minhasMusicas) if(musica.getTitulo().equals(nome)) return musica;
        return null;
    }

    public void proximaMusica(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else{
            if(minhasMusicas.indexOf(musicaAtual) == minhasMusicas.size() - 1) System.out.println("Você está no final da lista de reprodução. Acesse a opção Escolher Música para mudar a música atual.");
            else{
                musicaAtual = minhasMusicas.get(minhasMusicas.indexOf(musicaAtual) + 1);
                musicaAtual.setEstado(true);
                System.out.printf("Reproduzindo agora a música %s...\n", musicaAtual);
            }
        }
    }

    public void musicaAnterior(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else{
            if(minhasMusicas.indexOf(musicaAtual) == 0) System.out.println("Você está no início da lista de reprodução! Acesse a opção Escolher Música para mudar a música atual.");
            else{
                musicaAtual = minhasMusicas.get(minhasMusicas.indexOf(musicaAtual) - 1);
                musicaAtual.setEstado(true);
                System.out.printf("Reproduzindo agora a música %s\n", musicaAtual);
            }
        }
    }

    public void escolheMusica(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas");
        else{
            System.out.print("Que música você deseja reproduzir?");
            String nome = entrada.nextLine();
            while(buscarMusica(nome) == null){
                System.out.print("Essa música não existe. Tente novamente: ");
                nome = entrada.nextLine();
            }
            musicaAtual = buscarMusica(nome);
            musicaAtual.setEstado(true);
            System.out.printf("Reproduzindo agora a música %s\n", musicaAtual);
        }
    }

    public void musicaAtual(){
        if(minhasMusicas.isEmpty()) System.out.println("Não há músicas!");
        else{
            System.out.printf("Informações sobre a música atual:\n%s (%s)\nDuração: %s\n", musicaAtual.getTitulo(), musicaAtual.getAutor(), musicaAtual.getDuracao());
            if(musicaAtual.getClassificacao() == 0) System.out.println("Classificação: A música ainda não foi classificada!");
            else System.out.printf("Classificação: %d", musicaAtual.getClassificacao());
        }
    }
}
