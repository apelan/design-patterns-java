package structural.adapter.executor;

public class SqlExecutor implements QueryExecutor {
    @Override
    public void execute(String query) {
        System.out.println("Executing SQL query: " + query);
    }
}
