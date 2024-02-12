package behavioral.visitor.computer;

import behavioral.visitor.computer.components.CPU;
import behavioral.visitor.computer.components.GPU;
import behavioral.visitor.computer.components.RAM;

// Concrete Visitor
public class SystemInformation implements SystemInformationVisitor {

    private final StringBuilder info = new StringBuilder();
    private double totalPrice = 0;

    @Override
    public void visit(CPU cpu) {
        String cpuInfo = String.format("[CPU] %s %s, cores %s - price %s$",
                cpu.getBrand(),
                cpu.getModel(),
                cpu.getCores(),
                cpu.getPrice());
        info.append(cpuInfo).append("\n");
        totalPrice += cpu.getPrice();
    }

    @Override
    public void visit(RAM ram) {
        String ramInfo = String.format("[RAM] %s %s, memory %s - price %s$",
                ram.getBrand(),
                ram.getModel(),
                ram.getMemory(),
                ram.getPrice());
        info.append(ramInfo).append("\n");
        totalPrice += ram.getPrice();
    }

    @Override
    public void visit(GPU gpu) {
        String gpuInfo = String.format("[GPU] %s %s, cores %s - price %s$",
                gpu.getBrand(),
                gpu.getModel(),
                gpu.getVram(),
                gpu.getPrice());
        info.append(gpuInfo).append("\n");
        totalPrice += gpu.getPrice();
    }

    public String getSystemInfo() {
        return info.toString();
    }

    public double getSystemPrice() {
        return totalPrice;
    }

}
