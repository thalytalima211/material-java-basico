/*Exercicio: Crie um código que leia 6 letras e retorne quais e quantas foram as consoantes digitadas*/
import java.util.Scanner;
public class Exercicio2_array {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String[] consoantes = new String[6];
       int quantidadeConsoantes=0;

       for (int i=0;i<6;i++){
        System.out.print("Digite uma letra: ");
        String letra=entrada.next();
        if (!((letra.equalsIgnoreCase("a"))||
            (letra.equalsIgnoreCase("e")) ||
            (letra.equalsIgnoreCase("i")) ||
            (letra.equalsIgnoreCase("o")) ||
            (letra.equalsIgnoreCase("u")))){
                consoantes[i]=letra;
                quantidadeConsoantes++;
            }
       }
       System.out.println("As consoantes digitadas foram: ");
       for (String consoante : consoantes) if (consoante!=null) System.out.print(consoante+" ");
       System.out.println("\nForam digitadas "+quantidadeConsoantes+" consoantes");
    }
}
