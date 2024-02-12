package creational.prototype.component;

public abstract class Component {
    protected String name;
    protected double price;

    public Component() {}

    protected Component(Component component) {
        this.name = component.name;
        this.price = component.price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", hashcode=" + hashCode() +
                '}';
    }

    // this is prototype method
    public abstract Component clone();

}
