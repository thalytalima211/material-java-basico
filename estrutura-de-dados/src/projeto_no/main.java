package projeto_no;

public class main {
    public static void main(String[] args){
        no no1 = new no("conteúdo no1");

        no no2 = new no("conteúdo no2");
        no1.setProximoNo(no2);

        no no3 = new no("conteúdo no3");
        no2.setProximoNo(no3);

        no no4 = new no("conteúdo no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
