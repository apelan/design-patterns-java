package creational.singleton;

public class DataSource {

    // instance of itself
    private static DataSource instance;

    private final String connectionUrl;


    // private constructor
    // having connectionUrl here is pointless because only one instance is created, <br>
    // only first passed string will be used, others are ignores since constructor won't be called <br>
    // this exists here just for purpose of an example
    private DataSource(String connectionUrl) {
        this.connectionUrl = connectionUrl;
        System.out.println("Instance of Datasource created " +
                "| Hashcode: " + this.hashCode() + " " +
                "| Connection url: " + this.connectionUrl);
    }

    public static DataSource getInstance(String connectionUrl) {

        if (instance == null) {
            instance = new DataSource(connectionUrl); // lazy initialization
        }

        return instance;
    }

    // NOTE: this is not recommended, since it can cause low performance
    // check DataSourceThreadSafe class which is showing how can we solve this issue with double-checked locking pattern
    public static synchronized DataSource getInstanceThreadSafe(String connectionUrl) {

        if (instance == null) {
            instance = new DataSource(connectionUrl);
        }

        return instance;
    }

    public String getConnectionUrl() {
        return this.connectionUrl;
    }

}
