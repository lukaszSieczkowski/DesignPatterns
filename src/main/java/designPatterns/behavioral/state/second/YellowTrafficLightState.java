package designPatterns.behavioral.state.second;

public class YellowTrafficLightState extends TrafficLightState {

    private TrafficLight trafficLight;

    public YellowTrafficLightState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void changeLight() {
        System.out.println("Turning traffic light to red.");
        trafficLight.setState(trafficLight.getRedLightState());
    }

    public String toString() {
        return "Traffic light is yellow.";
    }
}