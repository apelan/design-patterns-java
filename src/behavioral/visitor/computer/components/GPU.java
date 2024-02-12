package behavioral.visitor.computer.components;

import behavioral.visitor.computer.SystemInformationVisitor;

public class GPU extends Component {

    private final int vram;

    public GPU(String brand, String model, double price, int vram) {
        super(brand, model, price);
        this.vram = vram;
    }

    @Override
    public void gatherInfo(SystemInformationVisitor visitor) {
        visitor.visit(this);
    }

    public int getVram() {
        return vram;
    }
}
