package StatePattern;

public class TrafficLight {

    private State redLightWithNoCar;
    private State redLightWithCar;
    private State greenLightWithNoCar;
    private State greenLightWithCar;

    private State state;

    //actions
    public void carArrives(){
        state.carArrives(this);
    }

    public void allCarsLeave(){
        state.allCarsLeave(this);
    }

    public TrafficLight(){
        redLightWithNoCar = new RedLightWithNoCar();
        redLightWithCar = new RedLightWithCar();
        greenLightWithNoCar = new GreenLightWithNoCar();
        greenLightWithCar = new GreenLightWithCar();
    }

    public State getRedLightWithNoCar() {
        return redLightWithNoCar;
    }

    public void setRedLightWithNoCar(State redLightWithNoCar) {
        this.redLightWithNoCar = redLightWithNoCar;
    }

    public State getRedLightWithCar() {
        return redLightWithCar;
    }

    public void setRedLightWithCar(State redLightWithCar) {
        this.redLightWithCar = redLightWithCar;
    }

    public State getGreenLightWithNoCar() {
        return greenLightWithNoCar;
    }

    public void setGreenLightWithNoCar(State greenLightWithNoCar) {
        this.greenLightWithNoCar = greenLightWithNoCar;
    }

    public State getGreenLightWithCar() {
        return greenLightWithCar;
    }

    public void setGreenLightWithCar(State greenLightWithCar) {
        this.greenLightWithCar = greenLightWithCar;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
