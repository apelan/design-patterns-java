package creational.prototype;

import java.util.ArrayList;
import java.util.List;

import creational.prototype.component.CPU;
import creational.prototype.component.Component;
import creational.prototype.component.ComponentRegistry;
import creational.prototype.component.RAM;

public class PrototypeMain {

    public static void main(String[] args) {

        demo1_cloningNewObject();
//        demo2_useRegistry();

    }

    /**
     * This demo is showing us how can we easily create copies of multiple objects, without knowing concrete class.<br>
     * Clones have different hash codes, because they are copies of original objects.
     */
    public static void demo1_cloningNewObject() {
        List<Component> originalComponents = new ArrayList<>();
        originalComponents.add(new CPU("AMD Ryzen", 300, 6, 12));
        originalComponents.add(new RAM("Kingston Fury", 50, 16));

        System.out.println("Original components: " + originalComponents);

        List<Component> cloneOfComponents = new ArrayList<>();
        for (Component component : originalComponents) {
            cloneOfComponents.add(component.clone());
        }
        System.out.println("Clone of components: " + cloneOfComponents);
    }

    /**
     * This demo is showcasing us usage of Prototype registry. <br>
     * Each time registry gives us object, that is actually clone.
     */
    public static void demo2_useRegistry() {
        ComponentRegistry componentRegistry = new ComponentRegistry();

        Component cpu = componentRegistry.getComponent("cpu");
        System.out.println("CPU object retrieved from registry, hashcode: " + cpu.hashCode());

        Component ram = componentRegistry.getComponent("ram");
        System.out.println("RAM object retrieved from registry, hashcode: " + ram.hashCode());

    }

}
