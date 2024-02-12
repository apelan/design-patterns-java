package creational.singleton;

public class DataSourceThreadSafe {

    // volatile instance of itself
    private static volatile DataSourceThreadSafe instance;
    private final String connectionUrl;

    // private constructor
    private DataSourceThreadSafe(String connectionUrl) {
        this.connectionUrl = connectionUrl;
        System.out.println("Instance of Datasource created " +
                "| Hashcode: " + this.hashCode() + " " +
                "| Connection url: " + this.connectionUrl);
    }

    public static DataSourceThreadSafe getInstance(String connectionUrl) {
        // save instance in local variable, reason is to avoid reading it multiple times directly from main memory
        DataSourceThreadSafe localInstance = instance;

        if(localInstance == null) { // double-checked locking pattern
            synchronized (DataSourceThreadSafe.class) {
                // same as above
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DataSourceThreadSafe(connectionUrl);
                }
            }
        }

        return localInstance;
    }

}
