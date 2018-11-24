package designPatterns.behavioral.state.second;

public class TrafficLight {
   private TrafficLightState red;
   private TrafficLightState yellow;
   private TrafficLightState green;

    private TrafficLightState state;

    public TrafficLight() {
        red = new RedTrafficLightState(this);
        yellow = new YellowTrafficLightState(this);
        green = new GreenTrafficLightState(this);
        state = red;
    }

    public void changeState() {
        state.changeLight();
    }

    public String toString() {
        return state.toString();
    }

    public  TrafficLightState getGreenLightState() {
        return green;
    }

    public  TrafficLightState getYellowLightState() {
        return yellow;
    }

    public  TrafficLightState getRedLightState() {
        return red;
    }

    public void setState( TrafficLightState state) {
        this.state = state;
    }
}
