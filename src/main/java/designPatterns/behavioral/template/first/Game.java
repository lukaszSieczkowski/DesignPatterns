package designPatterns.behavioral.template.first;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endplay();

    public final void play(){
        initialize();
        startPlay();
        endplay();
    }

}
