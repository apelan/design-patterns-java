package behavioral.visitor;

import java.util.Arrays;
import java.util.List;

import behavioral.visitor.computer.SystemInformation;
import behavioral.visitor.computer.components.CPU;
import behavioral.visitor.computer.components.Component;
import behavioral.visitor.computer.components.GPU;
import behavioral.visitor.computer.components.RAM;

public class VisitorMain {

    public static void main(String[] args) {

        CPU cpu = new CPU("AMD", "Ryzen 7 5800X", 250, 8);
        GPU gpu = new GPU("NVidia", "RTX4090", 2000, 24);
        RAM ram = new RAM("Kingston", "Fury", 80, 32);

        SystemInformation systemInformation = new SystemInformation();

        List<Component> components = Arrays.asList(cpu, gpu, ram);
        components.forEach(component -> component.gatherInfo(systemInformation));

        System.out.println("System information:");
        System.out.println(systemInformation.getSystemInfo());
        System.out.println("Total price of this system: " + systemInformation.getSystemPrice());

    }

}
