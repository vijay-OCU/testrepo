package StatePattern;

public class RedLightWithCar implements State {

    @Override
    public void carArrives(TrafficLight trafficLight) {
    	System.out.print("+++ Car Arrives:");
        System.out.println("A car is waiting");
    }

    @Override
    public void allCarsLeave(TrafficLight trafficLight) {
    	System.out.print("--- All Cars Leave:");
        System.out.println("Cars broke the law");
        System.out.println("--> Changing state from 'Red Light with Car' to 'Red Light with No car'");
        trafficLight.setState(trafficLight.getRedLightWithNoCar());
    }
}
