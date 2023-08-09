/*Exercício: Crie um programa em Java que leia um vetor e imprima a ele e seu inverso */

import java.util.Scanner;

public class Exercicio1_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos desejada no vetor: ");lei
        int comprimento = scan.nextInt();
        int[] vetor = new int[comprimento];

        for(int i = 0; i < comprimento; i++){
            System.out.printf("Digite o %dº elemento: ", i +1);
            vetor[i] = scan.nextInt();
        }
        
        System.out.print("Vetor:");
        for (int i = 0; i < comprimento; i++) System.out.print(" " + vetor[i] + " ");
 
        System.out.print("\nVetor inverso:");
        for (int i = comprimento - 1; i >= 0; i--) System.out.print(" " + vetor[i] + " ");
    }
}
