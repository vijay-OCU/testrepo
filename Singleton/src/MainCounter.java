
public class MainCounter {

    private static volatile MainCounter instance;
    private volatile int accessCount =0;

    public static MainCounter getInstance() {
        if (instance == null) {
            synchronized (MainCounter.class) {
                if (instance == null) {
                    instance = new MainCounter();
                }
            }
        }
        return instance;
    }

    public int getAccessCount() {
        accessCount++;
        return accessCount-1;
    }

}