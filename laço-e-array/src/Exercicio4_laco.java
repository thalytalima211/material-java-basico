/*Exercício: Crie um código que leia uma quantidade N inteira de números e imprima a quantidade números ímpares e pares */

import java.util.Scanner;

public class Exercicio4_laco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int quantidade=entrada.nextInt();
        int count=0,par=0,impar=0;

        while (count<quantidade){
            System.out.print("Digite um número: ");
            int numero=entrada.nextInt();
            if (numero%2==0) par++;
            else impar++;
            count++;
        }
        System.out.println("Foram inseridos "+par+" número(s) par(es)");
        System.out.println("Foram inseridos "+impar+" número(s) ímpar(es)");
    }    
}
