package structural.adapter;

import structural.adapter.executor.HqlExecutor;
import structural.adapter.executor.HqlToSqlAdapter;
import structural.adapter.executor.SqlExecutor;

public class AdapterMain {

    public static void main(String[] args) {
        String sql = "SELECT * FROM user";
        String hql = "FROM User";

        SqlExecutor sqlExecutor = new SqlExecutor();
        HqlExecutor hqlExecutor = new HqlExecutor();

        System.out.println("--------------");
        System.out.println("SQL EXECUTOR EXECUTING SQL QUERY: ");
        sqlExecutor.execute(sql);
        System.out.println("--------------");

        System.out.println("HQL EXECUTOR EXECUTING HQL QUERY: ");
        hqlExecutor.execute(hql);
        System.out.println("--------------");

        System.out.println("SQL EXECUTOR EXECUTING HQL QUERY WITH HELP OF AN ADAPTER:");
        new HqlToSqlAdapter().execute(hql);
        System.out.println("--------------");

    }

}
