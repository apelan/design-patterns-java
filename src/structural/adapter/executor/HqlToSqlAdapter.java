package structural.adapter.executor;

public class HqlToSqlAdapter implements QueryExecutor {

    private final SqlExecutor sqlExecutor;

    public HqlToSqlAdapter() {
        this.sqlExecutor = new SqlExecutor();
    }

    @Override
    public void execute(String query) {
        query = convertHqlToSql(query);
        sqlExecutor.execute(query);
    }

    /**
     * Following is dummy logic just for sake of an example.
     *
     * @param hql string
     * @return sql
     */
    private String convertHqlToSql(String hql) {
        System.out.println("Converting HQL query to SQL query...");
        return "SELECT * ".concat(hql);
    }
}
