package behavioral.command;

import behavioral.command.shoppingcart.AddItemCommand;
import behavioral.command.shoppingcart.PurchaseCommand;
import behavioral.command.shoppingcart.RemoveItemCommand;
import behavioral.command.shoppingcart.ShoppingCart;

public class CommandMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Customer customer = new Customer();

        customer.setCommand(new AddItemCommand(cart, "Item1"));
        customer.executeCommand();

        customer.setCommand(new AddItemCommand(cart, "Item2"));
        customer.executeCommand();

        customer.setCommand(new AddItemCommand(cart, "Item3"));
        customer.executeCommand();

        customer.setCommand(new RemoveItemCommand(cart, "Item1"));
        customer.executeCommand();

        customer.setCommand(new PurchaseCommand(cart));
        customer.executeCommand();

    }

}
