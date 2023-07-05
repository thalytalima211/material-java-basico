package Navegador;

import java.util.Scanner;

public class Safari implements Navegador{
    Scanner entrada = new Scanner(System.in);

    public void verEmails(){
        System.out.println("Você não tem emails recentes");
    }

    public void enviarEmails(){
        System.out.print("Qual o endereço de email do destinatário? ");
        String email = entrada.nextLine();
        System.out.println("Digite sua mensagem: ");
        String mensagem = entrada.nextLine();
        System.out.println("Email enviado!"); 
    }

    public void abrirAba(){
        System.out.print("Qual site você deseja acessar? ");
        String site = entrada.nextLine();
        System.out.println("Aba aberta!");
    }

    public void atualizarAba(){
        System.out.println("Atualizando aba...");
    }

    public void abrirSite(){
        System.out.print("Qual site você deseja acessar? ");
        String site = entrada.nextLine();
        System.out.println("Abrindo site...");
    }

    public void criarRota(){
        System.out.print("Para onde você deseja ir? ");
        String rota = entrada.nextLine();
        System.out.println("Criando rota no Google Maps...");
    }
}
