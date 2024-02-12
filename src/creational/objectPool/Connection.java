package creational.objectPool;

public class Connection {

    private String connectionUrl;

    public Connection() {
        System.out.println("New connection created...");
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

}
