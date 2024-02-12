package creational.multiton;

import java.util.HashMap;
import java.util.Map;

public class DataSource {

    private static Map<DataSourceType, DataSource> instances = new HashMap<>();

    // private constructor
    private DataSource() {
        System.out.println("New instance of Datasource created");
    }

    // this is simple working example <br>
    // in case you are in multithreaded environment make sure you make this thread-safe
    // take a look at singleton and how is it done there
    public static DataSource getInstance(DataSourceType type) {

        if (!instances.containsKey(type)) {
            instances.put(type, new DataSource());
        }

        return instances.get(type);
    }

}
