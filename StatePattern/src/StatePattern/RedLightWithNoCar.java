package StatePattern;

public class RedLightWithNoCar implements State {

    @Override
    public void carArrives(TrafficLight trafficLight) {
    	System.out.print("+++ Car Arrives:");
        System.out.println("A car is waiting");
        System.out.println("--> Changing state from 'Red Light with No Car' to 'Red Light with car'");
        trafficLight.setState(trafficLight.getRedLightWithCar());
        
    }

    @Override
    public void allCarsLeave(TrafficLight trafficLight) {
    	System.out.print("--- All Cars Leave:");
        System.out.println("That was weird!");

    }
}
