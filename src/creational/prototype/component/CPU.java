package creational.prototype.component;

public class CPU extends Component {

    private int core;
    private int thread;

    public CPU(String name, double price, int core, int thread) {
        this.name = name;
        this.price = price;
        this.core = core;
        this.thread = thread;
    }

    private CPU(CPU cpu) {
        super(cpu);
        this.core = cpu.core;
        this.thread = cpu.thread;
    }

    @Override
    public Component clone() {
        return new CPU(this);
    }
}
