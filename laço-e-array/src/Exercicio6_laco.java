/*Exercício: Crie um código que imprima o fatorial de um número N natural */

import java.util.Scanner;

public class Exercicio6_laco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual fatorial você quer conferir? ");
        int fatorial = entrada.nextInt();
        int count=1;

        for (int i=1;i<=fatorial;i++){
            count*=i;
        }
        System.out.println("O fatorial de "+fatorial+" é "+count);
    }
}
