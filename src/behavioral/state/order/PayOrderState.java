package behavioral.state.order;

public class PayOrderState extends OrderState {
    public PayOrderState(Order order) {
        super(order);
    }

    @Override
    public void executeNextStep() {
        order.pay();
        order.setState(new DeliverOrderState(order));
    }

    @Override
    public void cancelOrder() {
        order.setState(new CancelOrderState(order));
        order.cancel();
    }
}
