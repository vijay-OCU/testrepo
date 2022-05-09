package StatePattern;

public class SimulateTraffic {

    public static void main(String[] args) {

    	TrafficLight trafficLight = new TrafficLight();
    	System.out.println("Setting state to Green Light with No Car");
    	trafficLight.setState(trafficLight.getGreenLightWithCar());
    	trafficLight.carArrives();
    	trafficLight.allCarsLeave();
    	trafficLight.allCarsLeave();
    	trafficLight.carArrives();
    	
    	System.out.println("Setting state to Green Light with No Car");
    	trafficLight.setState(trafficLight.getGreenLightWithNoCar());
    	trafficLight.allCarsLeave();
    	trafficLight.carArrives();
    	trafficLight.carArrives();
    	trafficLight.allCarsLeave();
    	
    }	
}