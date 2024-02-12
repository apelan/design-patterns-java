package creational.abstractFactory.device.charger;

public class SamsungCharger implements Charger {
    @Override
    public int wattage() {
        return 45;
    }
}
