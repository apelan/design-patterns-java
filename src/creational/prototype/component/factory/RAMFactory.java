package creational.prototype.component.factory;

import creational.prototype.component.Component;
import creational.prototype.component.RAM;

public class RAMFactory implements ComponentFactory {
    @Override
    public Component getComponent() {
        return new RAM("Kingston Fury", 50, 16);
    }
}
