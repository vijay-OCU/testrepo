import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestHarness {
    public static void main(String[] args) {

        MainCounter counterOne = MainCounter.getInstance();
        MainCounter counterTwo = MainCounter.getInstance();
        MainCounter counterThree = MainCounter.getInstance();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(() -> {
            System.out.println("counterOne value is " + counterOne.getAccessCount());
        });
        executor.submit(() -> {
            System.out.println("counterTwo value is " + counterTwo.getAccessCount());
        });
        executor.submit(() -> {
            System.out.println("counterThree value is " + counterThree.getAccessCount());
        });
        executor.shutdown();
    }
}