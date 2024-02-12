package creational.objectPool;

public class ObjectPoolMain {

    public static void main(String[] args) throws InterruptedException {
        ConnectionPool connectionPool = ConnectionPool.getInstance();

        System.out.println("Pool size: " + connectionPool.getPoolSize());

        Connection connection1 = connectionPool.getConnection();
        Connection connection2 = connectionPool.getConnection();
        Connection connection3 = connectionPool.getConnection();

        System.out.println("Connection #1: " + connection1);
        System.out.println("Connection #2: " + connection2);
        System.out.println("Connection #3: " + connection3);

        System.out.println("Pool size: " + connectionPool.getPoolSize());
        System.out.println("Releasing connection #3");
        connectionPool.releaseConnection(connection3);

        System.out.println("Pool size: " + connectionPool.getPoolSize());

        System.out.println("Connection #3: " + connection3);

    }

}
