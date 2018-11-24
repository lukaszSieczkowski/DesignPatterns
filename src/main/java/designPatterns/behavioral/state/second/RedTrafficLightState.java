package designPatterns.behavioral.state.second;
public class RedTrafficLightState extends TrafficLightState{

    private TrafficLight trafficLight;

    public RedTrafficLightState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void changeLight() {
        System.out.println("Turning traffic light to green...");
        trafficLight.setState(trafficLight.getGreenLightState());
    }

    public String toString() {
        return "Traffic light is on red.";
    }
}