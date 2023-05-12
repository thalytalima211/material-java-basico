/*Exercício: Crie um código que leia 5 números inteiros e imprima o maior deles e a media de todos */
import java.util.Scanner;

public class Exercício3_laco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int count=0;
        int maior=0;
        float media=0;

        while (count<5) {
            System.out.print("Digite um número:");
            numero = entrada.nextInt();
            if (numero>maior) maior=numero;
            media+=numero;
            count+=1;
        }
        
        System.out.println("O maior número é: "+maior);
        System.out.println("A média dos números foi: "+media/5);
    }
}
