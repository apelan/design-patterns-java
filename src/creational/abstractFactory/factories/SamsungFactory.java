package creational.abstractFactory.factories;

import creational.abstractFactory.device.charger.Charger;
import creational.abstractFactory.device.charger.SamsungCharger;
import creational.abstractFactory.device.mobilephone.MobilePhone;
import creational.abstractFactory.device.mobilephone.SamsungPhone;
import creational.abstractFactory.device.tablet.SamsungTablet;
import creational.abstractFactory.device.tablet.Tablet;

public class SamsungFactory implements DeviceFactory {

    // all methods can accept different criteria parameters and based on them, it will create different objects
    // check factory method to see example
    @Override
    public MobilePhone getMobilePhone() {
        return new SamsungPhone();
    }

    @Override
    public Tablet getTablet() {
        return new SamsungTablet();
    }

    @Override
    public Charger getCharger() {
        return new SamsungCharger();
    }
}
