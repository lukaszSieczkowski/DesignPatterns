package designPatterns.behavioral.command.second;

public class Client {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCOmmand(light);
        Command lightOff = new LightOffCOmmand(light);

        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}
