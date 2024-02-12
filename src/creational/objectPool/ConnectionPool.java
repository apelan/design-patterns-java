package creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class ConnectionPool {

    private static final int POOL_SIZE = 10;
    private static ConnectionPool instance;
    private BlockingQueue<Connection> pool;

    private ConnectionPool() {
        pool = new LinkedBlockingDeque<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            pool.offer(new Connection());
        }
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws InterruptedException {
        return pool.take();
    }

    public void releaseConnection(Connection connection) {
        this.pool.offer(connection);
    }

    public int getPoolSize() {
        return this.pool.size();
    }

}
