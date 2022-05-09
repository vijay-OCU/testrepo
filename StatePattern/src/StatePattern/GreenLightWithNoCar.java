package StatePattern;

public class GreenLightWithNoCar implements State {

    @Override
    public void carArrives(TrafficLight trafficLight) {
    	System.out.print("+++ Car Arrives:");
        System.out.println("In Green Light, Cars still here!");
        System.out.println("--> Changing state from 'Green Light with No Car' to 'Green Light with car'");
        trafficLight.setState(trafficLight.getGreenLightWithCar());
    }

    @Override
    public void allCarsLeave(TrafficLight trafficLight) {
    	System.out.print("--- All Cars Leave:");
        System.out.println("No cars here, but they left.");
        System.out.println("--> Changing state from 'Green Light with No Car' to 'Red Light with no car'");
        trafficLight.setState(trafficLight.getRedLightWithNoCar());
    }
}
