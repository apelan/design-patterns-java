package creational.prototype.component;

import java.util.HashMap;
import java.util.Map;

import creational.prototype.component.factory.CPUFactory;
import creational.prototype.component.factory.ComponentFactory;
import creational.prototype.component.factory.RAMFactory;

/**
 * Prototype registry is class which is responsible to store frequently accessed prototypes. <br>
 * It stored pre-built objects that are ready to be used.
 */
public class ComponentRegistry {
    private final Map<String, Component> cache = new HashMap<>();

    public ComponentRegistry() {

        // This is implementation of factory method pattern
        ComponentFactory cpuFactory = new CPUFactory();
        ComponentFactory ramFactory = new RAMFactory();

        Component cpu = cpuFactory.getComponent();
        System.out.println("CPU object created in registry, hash code: " + cpu.hashCode());
        cache.put("cpu", cpu);

        Component ram = cpuFactory.getComponent();
        System.out.println("RAM object created in registry, hash code: " + ram.hashCode());
        cache.put("ram", ram);
    }

    /**
     * When calling getComponent method we are getting clone of object.
     */
    public Component getComponent(String key) {
        return cache.get(key).clone();
    }

}
