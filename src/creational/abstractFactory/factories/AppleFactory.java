package creational.abstractFactory.factories;

import creational.abstractFactory.device.charger.AppleCharger;
import creational.abstractFactory.device.charger.Charger;
import creational.abstractFactory.device.mobilephone.ApplePhone;
import creational.abstractFactory.device.mobilephone.MobilePhone;
import creational.abstractFactory.device.tablet.AppleTablet;
import creational.abstractFactory.device.tablet.Tablet;

public class AppleFactory implements DeviceFactory {

    // all methods can accept different criteria parameters and based on them, it will create different objects
    // check factory method to see example
    @Override
    public MobilePhone getMobilePhone() {
        return new ApplePhone();
    }

    @Override
    public Tablet getTablet() {
        return new AppleTablet();
    }

    @Override
    public Charger getCharger() {
        return new AppleCharger();
    }
}
