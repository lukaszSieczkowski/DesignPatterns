package designPatterns.behavioral.command.second;

public class Light {
    private boolean on;

    public void schitchOn(){
        on = true;
    }

    public void switchOff(){
        on = false;
    }
}
