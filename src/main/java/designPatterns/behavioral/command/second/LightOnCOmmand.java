package designPatterns.behavioral.command.second;

public class LightOnCOmmand implements Command{
    private Light light;

    public LightOnCOmmand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Light is on");
        light.schitchOn();
    }
}
