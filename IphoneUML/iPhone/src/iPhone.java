import Correio_Telefonico.Telefone;
import Navegador.Safari;
import Reprodutor_Musical.iPod;

import java.util.Scanner;

public class iPhone {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Telefone telefone = new Telefone();
        iPod reproutor = new iPod();
        Safari navegador = new Safari();

        System.out.println("Bem-vindo(a) ao Iphone!");
        while(true){
            System.out.println("MENU:");
            System.out.println("1 - Telefone");
            System.out.println("2 - iPod");
            System.out.println("3 - Safari (Navegador)");
            System.out.println("4 - Encerrar iPhone");
            System.out.print("Qual aplicativo você deseja acessar? ");
            int app = entrada.nextInt();
            switch(app){
                case 1:
                    System.out.println("Entrando no app Telefone...");
                    while(true){
                        System.out.println("OPÇÕES: ");
                        System.out.println("1 - Realizar chamada");
                        System.out.println("2 - Atender chamada");
                        System.out.println("3 - Chamada no viva-voz");
                        System.out.println("4 - Rejeitar chamada");
                        System.out.println("5 - Ver chamadas recentes");
                        System.out.println("6 - Ver chamadas perdidas");
                        System.out.println("7 - Ouvir mensagens de voz");
                        System.out.println("8 - Salvar contato");
                        System.out.println("9 - Ver contatos");
                        System.out.println("10 - Adicionar favorito");
                        System.out.println("11 - Ver favoritos");
                        System.out.println("12 - Enviar SMS");
                        System.out.print("Escolha uma opcao: ");
                        int opcao = entrada.nextInt();;

                        if(opcao == 1) telefone.fazLigacao();
                        else if(opcao == 2) telefone.atenderLigacao();
                        else if(opcao == 3) telefone.vivaVoz();
                        else if(opcao == 4) telefone.rejeitarLigacao();
                        else if(opcao == 5) telefone.verLigacoesRecentes();
                        else if(opcao == 6) telefone.verLigacoesPerdidas();
                        else if(opcao == 7) telefone.ouvirCorreioDeVoz();
                        else if(opcao == 8) telefone.salvarContato();
                        else if(opcao == 9) telefone.verContatos();
                        else if(opcao == 10) telefone.adicionarFavorito();
                        else if(opcao == 11) telefone.verFavoritos();
                        else if(opcao == 12) telefone.enviarSMS();
                        else System.out.println("Opção inválida!");

                        System.out.println("\nO que deseja fazer agora?");
                        System.out.println("1 - Continuar no telefone");
                        System.out.println("2 - Ir para o menu principal");
                        int encerra;
                        do{
                            System.out.print("Digite uma opção: ");
                            encerra =  entrada.nextInt();
                            if(encerra != 1 && encerra != 2) System.out.println("Opção inválida! Tente novamente...");
                        }while(encerra != 1 && encerra != 2);
                        if(encerra == 2) break;
                    }
                    break;
                case 2:
                    System.out.println("Entrandoo no app iPod...");
                    while(true){
                        System.out.println("\nMENU: ");
                        System.out.println("1 - Tocar música");
                        System.out.println("2 - Pausar música");
                        System.out.println("3 - Aumentar volume");
                        System.out.println("4 - Diminuir volume");
                        System.out.println("5 - Classificar música");
                        System.out.println("6 - Informações sobre a música atual");
                        System.out.println("7 - Próxima música");
                        System.out.println("8 - Música Anteior");
                        System.out.println("9 - Selecionar música");
                        System.out.println("10 - Listar músicas");
                        System.out.println("11 - Listar Artistas");
                        System.out.println("12 - Adicionar música");
                        System.out.print("Escolha uma opção: ");
                        int opcao = entrada.nextInt();

                        if(opcao == 1) reproutor.play();
                        else if(opcao == 2) reproutor.pause();
                        else if(opcao == 3) reproutor.aumentaVolume();
                        else if(opcao == 4) reproutor.diminuiVolume();
                        else if(opcao == 5) reproutor.classificarMusica();
                        else if(opcao == 6) reproutor.musicaAtual();
                        else if(opcao == 7) reproutor.proximaMusica();
                        else if(opcao == 8) reproutor.musicaAnterior();
                        else if(opcao == 9) reproutor.escolheMusica();
                        else if(opcao == 10) reproutor.verMusicas();
                        else if(opcao == 11) reproutor.verArtistas();
                        else if(opcao == 12) reproutor.adicionarMusica();
                        else System.out.println("Opção inválida!");

                        System.out.println("\nO que deseja fazer agora?");
                        System.out.println("1 - Continuar no iPod");
                        System.out.println("2 - Ir para o menu principal");
                        int encerra;
                        do{
                            System.out.print("Digite uma opção: ");
                            encerra =  entrada.nextInt();
                            if(encerra != 1 && encerra != 2) System.out.println("Opção inválida! Tente novamente...");
                        }while(encerra != 1 && encerra != 2);
                        if(encerra == 2) break;
                    }
                    break;
                case 3:
                    System.out.println("Entrando no app Safari...");
                    while(true){
                        System.out.println("MENU");
                        System.out.println("1 - Ver emails");
                        System.out.println("2 - Enviar emails");
                        System.out.println("3 - Abrir aba");
                        System.out.println("4 - Abrir site");
                        System.out.println("5 - Atualizar aba");
                        System.out.println("6 - Criar rota no Maps");
                        System.out.print("Escolha uma opção: ");
                        int opcao = entrada.nextInt();

                        if(opcao == 1) navegador.verEmails();
                        else if(opcao == 2) navegador.enviarEmails();
                        else if(opcao == 3) navegador.abrirAba();
                        else if(opcao == 4) navegador.abrirSite();
                        else if(opcao == 5) navegador.atualizarAba();
                        else if(opcao == 6) navegador.criarRota();
                        else System.out.println("Opção inválida!");

                        System.out.println("\nO que deseja fazer agora?");
                        System.out.println("1 - Continuar no Safari");
                        System.out.println("2 - Ir para o menu principal");
                        int encerra;
                        do{
                            System.out.print("Digite uma opção: ");
                            encerra =  entrada.nextInt();
                            if(encerra != 1 && encerra != 2) System.out.println("Opção inválida! Tente novamente...");
                        }while(encerra != 1 && encerra != 2);
                        if(encerra == 2) break;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Esse app não existe! Tente novamente");
                    break;
            }
            if(app == 4){
                System.out.println("Encerrando iPhone...");
                break;
            }
        }
        System.out.println("Obrigada por utilizar o iPhone!");
    }
}
