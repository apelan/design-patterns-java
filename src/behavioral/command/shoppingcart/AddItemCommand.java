package behavioral.command.shoppingcart;

// Concrete Command
public class AddItemCommand implements CartCommand {

    private final ShoppingCart cart;
    private final String item;

    public AddItemCommand(ShoppingCart cart, String item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        System.out.println("Executing " + this.getClass().getSimpleName() + " with item " + item);
        cart.addItem(item);
    }
}
