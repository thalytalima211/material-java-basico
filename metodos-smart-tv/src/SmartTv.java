public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=10;

    /**
    * esse  método liga a tv 
    */

    public void ligar(){
        ligada=true;
        System.out.println("A TV foi ligada");
    }

    public void desligar(){
        ligada=false;
        System.out.println("A TV foi desligada");
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("O volume da TV é: "+volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("O volume da TV é: "+volume);
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println("O canal da TV é: "+ canal);
    }

    public void diminuirCanal(){
        canal --;
        System.out.println("O canal da TV é: "+ canal);
    }
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
        System.out.println("O canal da TV é: "+ canal);
    }
}
