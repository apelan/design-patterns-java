package behavioral.visitor.computer.components;

import behavioral.visitor.computer.SystemInformationVisitor;

public class CPU extends Component {

    private final int cores;

    public CPU(String brand, String model, double price, int cores) {
        super(brand, model, price);
        this.cores = cores;
    }

    @Override
    public void gatherInfo(SystemInformationVisitor visitor) {
        visitor.visit(this);
    }

    public int getCores() {
        return cores;
    }
}
