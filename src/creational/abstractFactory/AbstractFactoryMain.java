package creational.abstractFactory;

import creational.abstractFactory.factories.AppleFactory;
import creational.abstractFactory.factories.DeviceFactory;
import creational.abstractFactory.factories.SamsungFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        DeviceFactory samsungFactory = new SamsungFactory();
        System.out.println("Samsung phones have operating system: "
                + samsungFactory.getMobilePhone().operatingSystem());
        System.out.println("Samsung tables name is: "
                + samsungFactory.getTablet().name());
        System.out.println("Samsung charger have wattage: "
                + samsungFactory.getCharger().wattage() + "W");
        System.out.println("---------------------------------");

        DeviceFactory appleFactory = new AppleFactory();
        System.out.println("Apple phones have operating system: "
                + appleFactory.getMobilePhone().operatingSystem());
        System.out.println("Apple tables name is: "
                + appleFactory.getTablet().name());
        System.out.println("Apple charger have wattage: "
                + appleFactory.getCharger().wattage() + "W");

    }

}
