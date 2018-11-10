package designPatterns.behavioral.observer.third;

public class Television implements Observer,Media{

    private int[] results;
    private Lotto lotto;


    public Television(Lotto lotto){
        results = new int[6];
        this.lotto = lotto;
    }
    public void update(int[]tab){
        for(int i=0;i<6;i++){
            results[i]=tab[i];
        }
    }

    public void inform(){

        System.out.println("Lotto draw in TV");
        for(int i:results)
            System.out.print(i + " ");
        System.out.println();
    }

    public void leave(){
        lotto.removeObserver(this);
    }
}
