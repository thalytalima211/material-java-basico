public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? "+ smartTv.ligada);
        System.out.println("Volume da TV:"+smartTv.volume);
        System.out.println("Em que canal está a TV: "+smartTv.canal);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(20);
       }
}
