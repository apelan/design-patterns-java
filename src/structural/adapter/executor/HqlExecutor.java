package structural.adapter.executor;

public class HqlExecutor implements QueryExecutor {
    @Override
    public void execute(String query) {
        System.out.println("Executing HQL query: " + query);
    }
}
