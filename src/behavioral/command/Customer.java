package behavioral.command;

import behavioral.command.shoppingcart.CartCommand;

// Invoker
public class Customer {
    private CartCommand command;

    public void setCommand(CartCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
