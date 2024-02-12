package behavioral.command.shoppingcart;

// Concrete Command
public class RemoveItemCommand implements CartCommand {

    private final ShoppingCart cart;
    private final String item;

    public RemoveItemCommand(ShoppingCart cart, String item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        System.out.println("Executing " + this.getClass().getSimpleName() + " with item " + item);
        cart.removeItem(item);
    }
}
