package creational.abstractFactory.device.charger;

public class AppleCharger implements Charger {
    @Override
    public int wattage() {
        return 25;
    }
}
