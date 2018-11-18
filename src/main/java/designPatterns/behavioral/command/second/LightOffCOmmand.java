package designPatterns.behavioral.command.second;

public class LightOffCOmmand implements Command {
    private Light light;

    public LightOffCOmmand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Ligth is off");
        light.switchOff();
    }
}
