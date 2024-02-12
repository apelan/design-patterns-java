package behavioral.visitor.computer.components;

import behavioral.visitor.computer.SystemInformationVisitor;

public class RAM extends Component {

    private final int memory;

    public RAM(String brand, String model, double price, int memory) {
        super(brand, model, price);
        this.memory = memory;
    }

    @Override
    public void gatherInfo(SystemInformationVisitor visitor) {
        visitor.visit(this);
    }

    public int getMemory() {
        return memory;
    }
}
