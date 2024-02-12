package creational.prototype.component.factory;

import creational.prototype.component.CPU;
import creational.prototype.component.Component;

public class CPUFactory implements ComponentFactory {
    @Override
    public Component getComponent() {
        return new CPU("AMD Ryzen", 300, 6, 12);
    }
}
