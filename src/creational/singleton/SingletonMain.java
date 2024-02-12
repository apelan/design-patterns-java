package creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        // !NOTE! Demo methods must be used one by one, uncomment only one you are using for demo

        demo1_createSingleton();
//        demo2_createSingleton_inSeparateThreads();
//        demo3_createSingleton_inSeparateThreads_threadSafe();
//        demo4_createSingleton_enum();
    }

    /**
     * This demo is showing us how Singleton works, ONLY ONE object will be created
     */
    private static void demo1_createSingleton() {
        DataSource dataSource1 = DataSource.getInstance("test-connection-url");
        DataSource dataSource2 = DataSource.getInstance("this-should-never-be-set");

        System.out.println("Data source 1 connection url: " + dataSource1.getConnectionUrl());
        System.out.println("Data source 2 connection url: " + dataSource2.getConnectionUrl());
    }


    /**
     * This demo is showing us how Singleton works in multithreaded environment, TWO objects will be created
     * Each thread creates its own singleton
     */
    private static void demo2_createSingleton_inSeparateThreads() {
        new Thread(() -> DataSource.getInstance("test-connection-url")).start();
        new Thread(() -> DataSource.getInstance("this-should-never-be-set")).start();
    }

    /**
     * This demo is showing us correct way to use Singleton pattern in multithreaded environment,
     * ONLY ONE object will be created
     */
    private static void demo3_createSingleton_inSeparateThreads_threadSafe() {
        new Thread(() -> DataSourceThreadSafe.getInstance("test-connection-url")).start();
        new Thread(() -> DataSourceThreadSafe.getInstance("this-should-never-be-set")).start();
    }

    /**
     * This demo is showing us how to use enumerators to create Singleton,
     * ONLY ONE object will be created
     */
    private static void demo4_createSingleton_enum() {
        DataSourceEnum dataSource1 = DataSourceEnum.INSTANCE;
        DataSourceEnum dataSource2 = DataSourceEnum.INSTANCE;

        System.out.println("Data source 1 connection url: " + dataSource1.getConnectionUrl());
        System.out.println("Data source 2 connection url: " + dataSource2.getConnectionUrl());
    }


}
