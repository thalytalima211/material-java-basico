import java.util.Scanner;

public class Exercicio1_array {
    public static void main(String[] args) {
        int[] vetor = {-5,0,5,10,15,20}; /*voltar quando souber fazer o input aqui */
        int comprimento = vetor.length-1;
        
        System.out.print("Vetor:");
        for (int i=0;i<=comprimento;i++) System.out.print(" "+vetor[i]+" ");

        System.out.print("\nVetor inverso:");
        for (int i=comprimento; i>=0; i--) System.out.print(" "+vetor[i]+" ");
    }
}
