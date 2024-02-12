package behavioral.state.order;

public class CreatedOrderState extends OrderState {
    public CreatedOrderState(Order order) {
        super(order);
    }

    @Override
    public void executeNextStep() {
        order.confirm();
        order.setState(new ConfirmedOrderState(order));
    }

    @Override
    public void cancelOrder() {
        order.setState(new CancelOrderState(order));
        order.cancel();
    }

}
