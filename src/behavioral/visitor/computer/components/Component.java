package behavioral.visitor.computer.components;

import behavioral.visitor.computer.SystemInformationVisitor;

public abstract class Component {
    private String brand;
    private String model;
    private double price;

    public Component(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public abstract void gatherInfo(SystemInformationVisitor visitor);

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
