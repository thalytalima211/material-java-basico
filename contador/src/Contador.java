import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int num2 = scan.nextInt();
        try{
            contar(num1, num2);
        }catch(ParametrosInvalidosException exception){
            System.out.println("Erro! ," + exception.getMessage());
        }
    }
    static void contar(int num1, int num2) throws ParametrosInvalidosException{
       if(num1 > num2) throw new ParametrosInvalidosException("O primeiro parâmetro é maior que o segundo.") ;
       else{
            int contagem = num2 - num1;
            for(int i = 1; i <= contagem; i++){
                System.out.printf("Imprimindo o número %d....\n", i);
            }
       }
    }
}