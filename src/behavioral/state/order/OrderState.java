package behavioral.state.order;

public abstract class OrderState {
    protected Order order;

    public OrderState(Order order) {
        this.order = order;
    }

    public abstract void executeNextStep();
    public abstract void cancelOrder();

}
