package creational.singleton;

public enum DataSourceEnum {
    INSTANCE("test-connection-url");

    private final String connectionUrl;

    DataSourceEnum(String connectionUrl) {
        this.connectionUrl = connectionUrl;
        System.out.println("Instance of Datasource created " +
                "| Hashcode: " + this.hashCode() + " " +
                "| Connection url: " + this.connectionUrl);
    }

    public String getConnectionUrl() {
        return this.connectionUrl;
    }
}
