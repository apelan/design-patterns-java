package creational.abstractFactory.factories;

import creational.abstractFactory.device.charger.Charger;
import creational.abstractFactory.device.mobilephone.MobilePhone;
import creational.abstractFactory.device.tablet.Tablet;

public interface DeviceFactory {

    MobilePhone getMobilePhone();
    Tablet getTablet();
    Charger getCharger();

}
