package creational.multiton;

public class MultitonMain {

    public static void main(String[] args) {

        // in this example we see that new instance is created 4 times, for each DataSourceType
        DataSource mysqlDataSource = DataSource.getInstance(DataSourceType.MY_SQL);
        System.out.println("mysqlDataSource hashcode: " + mysqlDataSource.hashCode());
        System.out.println("-----------------");

        DataSource postgresqlDataSource = DataSource.getInstance(DataSourceType.POSTGRESQL);
        System.out.println("postgresqlDataSource hashcode: " + postgresqlDataSource.hashCode());
        System.out.println("-----------------");

        DataSource fileDataSource = DataSource.getInstance(DataSourceType.FILE);
        System.out.println("fileDataSource hashcode: " + fileDataSource.hashCode());
        System.out.println("-----------------");

        DataSource cloudDataSource = DataSource.getInstance(DataSourceType.CLOUD);
        System.out.println("cloudDataSource hashcode: " + cloudDataSource.hashCode());
        System.out.println("-----------------");




        // there will be no instantiation of object, we are only fetching them
        DataSource mysql1DataSource = DataSource.getInstance(DataSourceType.MY_SQL);
        System.out.println("mysql1DataSource hashcode: " + mysql1DataSource.hashCode());
        System.out.println("-----------------");

        DataSource mysql2DataSource = DataSource.getInstance(DataSourceType.MY_SQL);
        System.out.println("mysql2DataSource hashcode: " + mysql2DataSource.hashCode());
        System.out.println("-----------------");

        DataSource mysql3DataSource = DataSource.getInstance(DataSourceType.MY_SQL);
        System.out.println("mysql3DataSource hashcode: " + mysql3DataSource.hashCode());
        System.out.println("-----------------");

        DataSource file1DataSource = DataSource.getInstance(DataSourceType.FILE);
        System.out.println("file1DataSource hashcode: " + file1DataSource.hashCode());
        System.out.println("-----------------");

        DataSource file2DataSource = DataSource.getInstance(DataSourceType.FILE);
        System.out.println("file2DataSource hashcode: " + file2DataSource.hashCode());
        System.out.println("-----------------");

    }

}
