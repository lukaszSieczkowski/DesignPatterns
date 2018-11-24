package designPatterns.behavioral.state.second;

public class Client {
    public static void main(String []agrs){
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.changeState();
        trafficLight.changeState();
        trafficLight.changeState();
    }
}
