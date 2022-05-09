package StatePattern;

public class GreenLightWithCar implements  State {

    @Override
    public void carArrives(TrafficLight trafficLight) {
    	System.out.print("+++ Car Arrives:");	
        System.out.println("In Green Light, Cars still here!");
    }

    @Override
    public void allCarsLeave(TrafficLight trafficLight) {
    	System.out.print("--- All Cars Leave:");
        System.out.println("All cars gone, going to Red Light");
        System.out.println("--> Changing state from 'Green Light with Car' to 'Red Light with No car'");
        trafficLight.setState(trafficLight.getRedLightWithNoCar());
    }
}
