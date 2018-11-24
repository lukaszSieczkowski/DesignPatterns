package designPatterns.behavioral.state.second;

public class GreenTrafficLightState extends TrafficLightState {

    private TrafficLight trafficLight;

    public GreenTrafficLightState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void  changeLight() {
        System.out.println("Turning traffic light to yellow.");
        trafficLight.setState(trafficLight.getYellowLightState());
    }

    public String toString() {
        return "Traffic light is green.";
    }
}