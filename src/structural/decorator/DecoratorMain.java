package structural.decorator;

import structural.decorator.order.DiscountedOrderDecorator;
import structural.decorator.order.ExpeditedOrderDecorator;
import structural.decorator.order.Order;
import structural.decorator.order.SimpleOrder;

public class DecoratorMain {

    public static void main(String[] args) {

        Order simpleOrder = new SimpleOrder(1000001);

        Order discountedOrder = new DiscountedOrderDecorator(new SimpleOrder(2000002), 20);

        Order expeditedOrderDecorator = new ExpeditedOrderDecorator(
                new DiscountedOrderDecorator(
                        new SimpleOrder(3000003), 10));

        System.out.println("-----------");
        simpleOrder.process();
        System.out.println("-----------");
        discountedOrder.process();
        System.out.println("-----------");
        expeditedOrderDecorator.process();
        System.out.println("-----------");

    }

}
