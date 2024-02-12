package behavioral.command.shoppingcart;

// Concrete Command
public class PurchaseCommand implements CartCommand {
    private final ShoppingCart cart;

    public PurchaseCommand(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        System.out.println("Executing " + this.getClass().getSimpleName());
        cart.checkout();
    }
}
