package creational.prototype.component;

public class RAM extends Component {

    private int capacity;

    public RAM(String name, double price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    private RAM(RAM ram) {
        super(ram);
        this.capacity = ram.capacity;
    }

    @Override
    public Component clone() {
        return new RAM(this);
    }

}
