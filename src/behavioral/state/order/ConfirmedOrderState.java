package behavioral.state.order;

public class ConfirmedOrderState extends OrderState {
    public ConfirmedOrderState(Order order) {
        super(order);
    }

    @Override
    public void executeNextStep() {
        order.prepare();
        order.setState(new PayOrderState(order));
    }

    @Override
    public void cancelOrder() {
        order.setState(new CancelOrderState(order));
        order.cancel();
    }
}
