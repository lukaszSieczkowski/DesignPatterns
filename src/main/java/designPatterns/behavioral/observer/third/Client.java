package designPatterns.behavioral.observer.third;

public class Client {


    public static void main(String[]args){

        Lotto lotto = new Lotto();
        Television television= new Television(lotto);
        Internet internet = new Internet(lotto);
        lotto.addObserver(television);
        lotto.addObserver(internet);

        lotto.drav();
        System.out.println("DRAV 1\n");

        television.inform();
        internet.inform();

        lotto.drav();
        System.out.println("DRAV 2\n");

        television.inform();
        internet.inform();

        television.leave();
        
        lotto.drav();
        System.out.println("DRAV 3\n");

        television.inform();
        internet.inform();
    }
}
