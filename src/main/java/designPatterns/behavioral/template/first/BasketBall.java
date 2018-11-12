package designPatterns.behavioral.template.first;

public class BasketBall extends Game{
    @Override
    void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game Started. Enjoy the game!");
    }

    @Override
    void endplay() {
        System.out.println("Basketball Game Finished!");
    }
}
