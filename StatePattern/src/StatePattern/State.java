package StatePattern;

public interface State {

    public void carArrives(TrafficLight trafficLight);
    public void allCarsLeave(TrafficLight trafficLight);
}
