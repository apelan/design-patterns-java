package behavioral.chainOfResponsibility.request;

public class FeatureRequest {

    private final String name;
    private final int developersToAssign;
    private final double price;
    private final int daysToComplete;

    public FeatureRequest(String name, int developersToAssign, double price, int daysToComplete) {
        this.name = name;
        this.developersToAssign = developersToAssign;
        this.price = price;
        this.daysToComplete = daysToComplete;
    }

    public String getName() {
        return name;
    }

    public int getDevelopersToAssign() {
        return developersToAssign;
    }

    public double getPrice() {
        return price;
    }

    public int getDaysToComplete() {
        return daysToComplete;
    }
}
