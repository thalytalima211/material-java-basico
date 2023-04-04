import java.util.Scanner;

public class Exercicio5_laco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual tabuada você quer conferir? ");
        int tabuada=entrada.nextInt();
        System.out.println("Tabuada do "+tabuada);

        for (int i=1;i<=10;i++){
            System.out.println(tabuada+" x "+i+" = "+tabuada*i);
        }
    }
}
