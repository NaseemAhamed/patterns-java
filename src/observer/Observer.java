package observer;

public interface Observer {
    //public void update(float temp, float humidity, float pressure); -- -- Not scalable with parameters. We need to change our Observers to pull the data that’s appropriate for their needs.
    public void update();
}
