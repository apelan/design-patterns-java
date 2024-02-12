package behavioral.state.order;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new CreatedOrderState(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public void confirm() {
        System.out.println("Order is confirmed");
    }

    public void prepare() {
        System.out.println("Preparing order...");
    }

    public void pay() {
        System.out.println("Processing order payment...");
    }

    public void deliver() {
        System.out.println("Order is being delivered...");
    }

    public void cancel() {
        System.out.println("Canceling order");
    }

}
