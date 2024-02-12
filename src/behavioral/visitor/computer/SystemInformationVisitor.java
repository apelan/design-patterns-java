package behavioral.visitor.computer;

import behavioral.visitor.computer.components.CPU;
import behavioral.visitor.computer.components.GPU;
import behavioral.visitor.computer.components.RAM;

// Visitor interface
public interface SystemInformationVisitor {
    void visit(CPU cpu);
    void visit(RAM ram);
    void visit(GPU gpu);

}
