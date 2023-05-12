/*Exercício: Crie um código que imprima um array com 20 números aleatórios menores que 100 */

import java.util.Random;

public class Exercicio3_array {
    public static void main(String[] args) {
        Random aleatorio= new Random();
        int[] numerosAleatorios = new int[20];
        
        for (int i=0;i<20;i++) numerosAleatorios[i]=aleatorio.nextInt(100);
        
        System.out.println("Números aleatórios:");
        for (int i : numerosAleatorios) System.out.print(i+" ");

        System.out.println("\nSucessores dos números aleatórios:");
        for (int i : numerosAleatorios) System.out.print(++i+" ");
    }
}
    