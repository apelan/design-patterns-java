package creational.abstractFactory.device.mobilephone;

public class SamsungPhone implements MobilePhone {
    @Override
    public String name() {
        return "Samsung Galaxy";
    }

    @Override
    public String operatingSystem() {
        return "Android";
    }
}
