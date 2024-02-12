package behavioral.state;

import behavioral.state.order.Order;

public class StateMain {

    public static void main(String[] args) {

        System.out.println("--------");
        Order order1 = new Order();
        order1.getState().executeNextStep();
        order1.getState().executeNextStep();
        order1.getState().executeNextStep();
        order1.getState().executeNextStep();
        order1.getState().executeNextStep();
        System.out.println("Current order state: " + order1.getState().getClass().getSimpleName());
        System.out.println("--------");

        System.out.println("--------");
        Order order2 = new Order();
        order2.getState().executeNextStep();
        order2.getState().executeNextStep();
        order2.getState().executeNextStep();
        order2.getState().cancelOrder();
        order2.getState().executeNextStep();
        System.out.println("Current order state: " + order2.getState().getClass().getSimpleName());
        System.out.println("--------");

        System.out.println("--------");
        Order order3 = new Order();
        order3.getState().executeNextStep();
        order3.getState().executeNextStep();
        order3.getState().cancelOrder();
        order3.getState().executeNextStep();
        System.out.println("Current order state: " + order3.getState().getClass().getSimpleName());
        System.out.println("--------");

    }

}
